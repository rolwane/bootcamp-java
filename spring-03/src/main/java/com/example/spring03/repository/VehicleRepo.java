package com.example.spring03.repository;

import com.example.spring03.model.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepo {
    ObjectMapper mapper = new ObjectMapper();

    public Optional<Vehicle> getVehicle(String plate) {
        List<Vehicle> vehicleList = this.getAllVehicles();

        if (vehicleList != null) {
            for (Vehicle vehicle: vehicleList) {
                if (vehicle.getPlate().equals(plate)) {
                    return Optional.of(vehicle);
                }
            }
        }

        return Optional.empty();
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicleList = null;

        try {
            String pathJSON = "src/main/resources/vehicles.json";
            vehicleList = Arrays.asList(mapper.readValue(new File(pathJSON), Vehicle[].class));
        } catch(Exception e) {

        }

        return vehicleList;
    }
}
