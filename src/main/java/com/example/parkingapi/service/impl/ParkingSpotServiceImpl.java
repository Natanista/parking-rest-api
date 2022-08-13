package com.example.parkingapi.service.impl;

import com.example.parkingapi.model.ParkingSpotModel;
import com.example.parkingapi.repository.ParkingSpotRepository;
import com.example.parkingapi.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

    @Autowired
    ParkingSpotRepository repository;

    @Override
    public Object save(ParkingSpotModel parkingSpotModel) {
        return null;
    }
}
