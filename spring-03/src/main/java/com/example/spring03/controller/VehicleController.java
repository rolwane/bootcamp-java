package com.example.spring03.controller;

import com.example.spring03.exception.VehicleNotFoundException;
import com.example.spring03.model.Vehicle;
import com.example.spring03.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired // injeção de dependência (O framework cria o objeto)
    private VehicleService service;

    @GetMapping("/{plate}")
    public ResponseEntity<Vehicle> getVehicle(@PathVariable String plate) {
        try {
            Vehicle vehicle = service.getVehicle(plate);
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        } catch(VehicleNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return service.getAllVehicles();
    }
}
