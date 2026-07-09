package com.stp.shipmenttracking.dto;

import com.stp.shipmenttracking.enums.ShipmentStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShipmentResponse {

    private Long id;

    private String origin;

    private String destination;

    private Double weight;

    private ShipmentStatus status;

}
