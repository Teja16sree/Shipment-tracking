package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.TrackingLocationDTO;

public interface TrackingService {

    void broadcastLocation(TrackingLocationDTO locationDTO);

}
