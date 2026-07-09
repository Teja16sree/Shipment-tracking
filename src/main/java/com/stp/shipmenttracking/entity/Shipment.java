package com.stp.shipmenttracking.entity;

import com.stp.shipmenttracking.enums.ShipmentStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shipments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;

    private String destination;

    private Double weight;

    @Enumerated(EnumType.STRING)
    private ShipmentStatus status;

}
