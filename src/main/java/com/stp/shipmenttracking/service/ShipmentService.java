package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.ShipmentRequest;
import com.stp.shipmenttracking.dto.ShipmentResponse;

import java.util.List;

public interface ShipmentService {

    ShipmentResponse createShipment(ShipmentRequest request);

    List<ShipmentResponse> getAllShipments();

    ShipmentResponse getShipmentById(Long id);

}
