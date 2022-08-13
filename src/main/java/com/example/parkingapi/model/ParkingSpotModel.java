package com.example.parkingapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Data
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(unique = true, length = 7)
    private String licensePlateCar;

    @Column(length = 70)
    private String brandCar;

    @Column(length = 70)
    private String modelCar;

    @Column(length = 70)
    private String colorCar;

    @Column
    private LocalDateTime registrationDate;

    @Column(length = 130)
    private String responsibleName;

    @Column(length = 30)
    private String apartment;

    @Column(length = 30)
    private String block;
}
