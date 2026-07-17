package com.stp.shipmenttracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackingLocationDTO {

    private Long shipmentId;

    private Double latitude;

    private Double longitude;

}
