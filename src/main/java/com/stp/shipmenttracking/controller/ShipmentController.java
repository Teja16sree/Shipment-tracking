package com.stp.shipmenttracking.controller;

import com.stp.shipmenttracking.dto.ShipmentRequest;
import com.stp.shipmenttracking.dto.ShipmentResponse;
import com.stp.shipmenttracking.service.ShipmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
@RequiredArgsConstructor
public class ShipmentController {

    private final ShipmentService shipmentService;

    /**
     * Create a new shipment
     */
    @PostMapping
    public ResponseEntity<ShipmentResponse> createShipment(
            @Valid @RequestBody ShipmentRequest request) {

        ShipmentResponse response = shipmentService.createShipment(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    /**
     * Get all shipments
     */
    @GetMapping
    public ResponseEntity<List<ShipmentResponse>> getAllShipments() {

        return ResponseEntity.ok(
                shipmentService.getAllShipments());
    }

    /**
     * Get shipment by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<ShipmentResponse> getShipmentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                shipmentService.getShipmentById(id));
    }

    /**
     * Get all OPEN shipments
     */
    @GetMapping("/open")
    public ResponseEntity<List<ShipmentResponse>> getOpenShipments() {

        return ResponseEntity.ok(
                shipmentService.getOpenShipments());
    }

}