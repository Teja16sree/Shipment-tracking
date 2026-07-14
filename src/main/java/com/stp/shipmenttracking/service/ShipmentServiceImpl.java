package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.ShipmentRequest;
import com.stp.shipmenttracking.dto.ShipmentResponse;
import com.stp.shipmenttracking.entity.Shipment;
import com.stp.shipmenttracking.enums.ShipmentStatus;
import com.stp.shipmenttracking.repository.ShipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        return mapToResponse(shipment);
    }

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
    public List<ShipmentResponse> getOpenShipments() {

        return shipmentRepository.findByStatus(ShipmentStatus.OPEN)
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

}
