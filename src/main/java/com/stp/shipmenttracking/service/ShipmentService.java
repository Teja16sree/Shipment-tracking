package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.ShipmentRequest;
import com.stp.shipmenttracking.dto.ShipmentResponse;
import com.stp.shipmenttracking.enums.ShipmentStatus;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ShipmentService {

    ShipmentResponse createShipment(ShipmentRequest request);

    List<ShipmentResponse> getAllShipments();

    ShipmentResponse getShipmentById(Long id);

    List<ShipmentResponse> getOpenShipments();

    ShipmentResponse updateShipmentStatus(Long id, ShipmentStatus status);

    Page<ShipmentResponse> getShipments(int page, int size, String sortBy);

    List<ShipmentResponse> searchByOrigin(String origin);

}
