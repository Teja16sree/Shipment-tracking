package com.stp.shipmenttracking.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ShipmentRequest {

    @NotBlank(message = "Origin cannot be empty")
    @Size(min = 2, max = 100, message = "Origin must be between 2 and 100 characters")
    private String origin;

    @NotBlank(message = "Destination cannot be empty")
    @Size(min = 2, max = 100, message = "Destination must be between 2 and 100 characters")
    private String destination;

    @NotNull(message = "Weight is required")
    @Positive(message = "Weight must be greater than zero")
    private Double weight;

}