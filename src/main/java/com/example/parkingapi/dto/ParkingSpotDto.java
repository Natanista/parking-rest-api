package com.example.parkingapi.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ParkingSpotDto {

    @Max(10)
    @NotBlank
    private String parkingSpotNumber;

    @Max(7)
    @NotBlank
    private String licensePlateCar;

    @Max(70)
    @NotBlank
    private String brandCar;

    @Max(70)
    @NotBlank
    private String modelCar;

    @Max(70)
    @NotBlank
    private String colorCar;

    @NotBlank
    @Past
    private LocalDateTime registrationDate;

    @Max(130)
    @NotBlank
    private String responsibleName;

    @NotNull
    @Max(30)
    private String apartment;

    @NotBlank
    @Max(30)
    private String block;
}
