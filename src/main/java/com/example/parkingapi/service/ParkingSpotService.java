package com.example.parkingapi.service;

import com.example.parkingapi.model.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ParkingSpotService {
    ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    Page<ParkingSpotModel> findAll(Pageable pageable);

    Optional<ParkingSpotModel> findById(UUID id);

    void delete(ParkingSpotModel parkingSpotModel);
}
