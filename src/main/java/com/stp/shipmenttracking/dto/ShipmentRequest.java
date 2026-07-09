package com.stp.shipmenttracking.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ShipmentRequest {

    @NotBlank(message = "Origin cannot be empty")
    private String origin;

    @NotBlank(message = "Destination cannot be empty")
    private String destination;

    @NotNull(message = "Weight is required")
    @Positive(message = "Weight must be greater than zero")
    private Double weight;

}
