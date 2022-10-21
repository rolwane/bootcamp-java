package com.bootcamp.storage01.controller;

import com.bootcamp.storage01.model.User;
import com.bootcamp.storage01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user) {
        return new ResponseEntity<>(service.addNewUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<User> getUser(@PathVariable long cod) {
        Optional<User> user = service.findById(cod);

        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(service.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> updateUser(@PathVariable long cod) {
        service.deleteUser(cod);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
