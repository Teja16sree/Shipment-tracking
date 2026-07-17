package com.stp.shipmenttracking.websocket;

import com.stp.shipmenttracking.dto.TrackingLocationDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TrackingController {

    @MessageMapping("/updateLocation")
    public void receiveLocation(TrackingLocationDTO locationDTO) {

        System.out.println("Shipment ID : " + locationDTO.getShipmentId());

        System.out.println("Latitude : " + locationDTO.getLatitude());

        System.out.println("Longitude : " + locationDTO.getLongitude());

    }

}
