package com.example.parkingapi.service.impl;

import com.example.parkingapi.model.ParkingSpotModel;
import com.example.parkingapi.repository.ParkingSpotRepository;
import com.example.parkingapi.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {

    @Autowired
    ParkingSpotRepository repository;

    @Override
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return repository.save(parkingSpotModel);
    }

    @Override
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return repository.existsByLicensePlateCar(licensePlateCar);
    }

    @Override
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return repository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return repository.existsByApartamentAndBlock(apartment, block);
    }

    @Override
    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        repository.deleteById(parkingSpotModel.getId());
    }
}
