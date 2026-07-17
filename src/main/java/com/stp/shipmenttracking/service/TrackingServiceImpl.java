package com.stp.shipmenttracking.service;

import com.stp.shipmenttracking.dto.TrackingLocationDTO;
import com.stp.shipmenttracking.entity.TrackingLocation;
import com.stp.shipmenttracking.repository.TrackingLocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackingServiceImpl implements TrackingService {

    private final SimpMessagingTemplate messagingTemplate;
    private final TrackingLocationRepository trackingLocationRepository;

    @Override
    public void broadcastLocation(TrackingLocationDTO locationDTO) {
        TrackingLocation location = TrackingLocation.builder()
                .shipmentId(locationDTO.getShipmentId())
                .latitude(locationDTO.getLatitude())
                .longitude(locationDTO.getLongitude())
                .timestamp(java.time.LocalDateTime.now().toString())
                .build();

        trackingLocationRepository.save(location);

        messagingTemplate.convertAndSend(
                "/topic/shipment/" + locationDTO.getShipmentId(),
                locationDTO);
    }
}
