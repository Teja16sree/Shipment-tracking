package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.ShipmentRequest;
import com.stp.shipmenttracking.dto.ShipmentResponse;
import com.stp.shipmenttracking.entity.Shipment;
import com.stp.shipmenttracking.enums.ShipmentStatus;
import com.stp.shipmenttracking.exception.ResourceNotFoundException;
import com.stp.shipmenttracking.repository.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.stp.shipmenttracking.dto.DashboardResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;

    @Override
    public ShipmentResponse createShipment(ShipmentRequest request) {

        Shipment shipment = Shipment.builder()
                .origin(request.getOrigin())
                .destination(request.getDestination())
                .weight(request.getWeight())
                .status(ShipmentStatus.OPEN)
                .build();

        Shipment savedShipment = shipmentRepository.save(shipment);

        return mapToResponse(savedShipment);
    }

    @Override
    public List<ShipmentResponse> getAllShipments() {

        return shipmentRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ShipmentResponse getShipmentById(Long id) {

        Shipment shipment = shipmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Shipment not found with ID: " + id));

        return mapToResponse(shipment);
    }

    @Override
    public List<ShipmentResponse> getOpenShipments() {

        return shipmentRepository.findByStatus(ShipmentStatus.OPEN)
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ShipmentResponse updateShipmentStatus(Long id, ShipmentStatus status) {

        Shipment shipment = shipmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Shipment not found with ID: " + id));

        shipment.setStatus(status);

        Shipment updatedShipment = shipmentRepository.save(shipment);

        return mapToResponse(updatedShipment);
    }

    /**
     * Convert Entity to Response DTO
     */
    private ShipmentResponse mapToResponse(Shipment shipment) {

        return ShipmentResponse.builder()
                .id(shipment.getId())
                .origin(shipment.getOrigin())
                .destination(shipment.getDestination())
                .weight(shipment.getWeight())
                .status(shipment.getStatus())
                .build();
    }

    @Override
    public Page<ShipmentResponse> getShipments(
            int page,
            int size,
            String sortBy) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(sortBy).ascending());

        return shipmentRepository
                .findAll(pageable)
                .map(this::mapToResponse);
    }

    @Override
    public List<ShipmentResponse> searchByOrigin(String origin) {

        return shipmentRepository

                .findByOriginContainingIgnoreCase(origin)

                .stream()

                .map(this::mapToResponse)

                .toList();

    }

    @Override
    public DashboardResponse getDashboardStatistics() {

        long total = shipmentRepository.count();

        long open = shipmentRepository.countByStatus(ShipmentStatus.OPEN);

        long inTransit = shipmentRepository.countByStatus(ShipmentStatus.IN_TRANSIT);

        long delivered = shipmentRepository.countByStatus(ShipmentStatus.DELIVERED);

        return new DashboardResponse(

                total,

                open,

                inTransit,

                delivered

        );

    }
}