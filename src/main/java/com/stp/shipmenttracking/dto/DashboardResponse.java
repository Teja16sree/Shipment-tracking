package com.stp.shipmenttracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardResponse {

    private long totalShipments;
    private long openShipments;
    private long inTransitShipments;
    private long deliveredShipments;

}
