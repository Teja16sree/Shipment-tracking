package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.TrackingLocationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackingServiceImpl implements TrackingService {

    private final SimpMessagingTemplate messagingTemplate;

    @Override
    public void broadcastLocation(TrackingLocationDTO locationDTO) {

        System.out.println(

                "Broadcasting Location for Shipment "

                        + locationDTO.getShipmentId()

        );

        messagingTemplate.convertAndSend(

                "/topic/shipment/" + locationDTO.getShipmentId(),

                locationDTO

        );

    }

}
