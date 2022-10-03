package com.example.spring03.repository;

import com.example.spring03.model.Vehicle;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepo {
    ObjectMapper mapper = new ObjectMapper();
    String pathJSON = "src/main/resources/vehicles.json";

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
            vehicleList = Arrays.asList(mapper.readValue(new File(pathJSON), Vehicle[].class));
        } catch(Exception e) {

        }

        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<Vehicle> vehicles = new ArrayList<>(this.getAllVehicles());

        vehicles.add(vehicle);

        try {
            writer.writeValue(new File(pathJSON), vehicles);
        } catch (Exception ex) {

        }
    }
}
