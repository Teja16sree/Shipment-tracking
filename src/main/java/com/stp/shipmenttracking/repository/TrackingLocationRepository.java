package com.stp.shipmenttracking.repository;

import com.stp.shipmenttracking.entity.TrackingLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingLocationRepository extends JpaRepository<TrackingLocation, Long> {

}
