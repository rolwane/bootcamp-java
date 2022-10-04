package com.example.spring03.service;

import com.example.spring03.exception.NotFoundException;
import com.example.spring03.model.Vehicle;

import java.util.List;

public interface IVehicle {
    Vehicle getVehicle(String plate) throws NotFoundException;
    List<Vehicle> getAllVehicles();

    void addVehicle(Vehicle vehicle);
}
