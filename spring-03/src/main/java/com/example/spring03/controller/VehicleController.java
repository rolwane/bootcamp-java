package com.example.spring03.controller;

import com.example.spring03.exception.NotFoundException;
import com.example.spring03.model.Vehicle;
import com.example.spring03.service.IVehicle;
import com.example.spring03.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private IVehicle service;

    @GetMapping("/{plate}")
    public ResponseEntity<Vehicle> getVehicle(@PathVariable String plate) {
        Vehicle vehicle = service.getVehicle(plate);
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return new ResponseEntity<>(service.getAllVehicles(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void AddVehicle(@RequestBody Vehicle vehicle) {
        service.addVehicle(vehicle);
    }
}
