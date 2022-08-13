package com.example.parkingapi.service;

import com.example.parkingapi.model.ParkingSpotModel;
import org.springframework.stereotype.Service;

@Service
public interface ParkingSpotService {
    Object save(ParkingSpotModel parkingSpotModel);
}
