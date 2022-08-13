package com.example.parkingapi.controller;

import com.example.parkingapi.dto.ParkingSpotDto;
import com.example.parkingapi.model.ParkingSpotModel;
import com.example.parkingapi.service.impl.ParkingSpotServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/parking-spots")
public class ParkingSpotController {

    @Autowired
    ParkingSpotServiceImpl service;

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(
            @RequestBody @Valid ParkingSpotDto parkingSpotDto
            ){
        var parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(parkingSpotModel));
    }
}
