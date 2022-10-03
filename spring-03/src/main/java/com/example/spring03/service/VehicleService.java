package com.example.spring03.service;

import com.example.spring03.exception.VehicleNotFoundException;
import com.example.spring03.model.Vehicle;
import com.example.spring03.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicle {

    @Autowired
    private VehicleRepo repository;

    @Override
    public Vehicle getVehicle(String plate) throws VehicleNotFoundException {
        Optional<Vehicle> vehicle = repository.getVehicle(plate);

        if (vehicle.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle not found.");
        }

        return vehicle.get();
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return repository.getAllVehicles();
    }
}
