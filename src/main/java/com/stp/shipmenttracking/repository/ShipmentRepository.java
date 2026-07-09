package com.stp.shipmenttracking.repository;

import com.stp.shipmenttracking.entity.Shipment;
import com.stp.shipmenttracking.enums.ShipmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    List<Shipment> findByStatus(ShipmentStatus status);

}
