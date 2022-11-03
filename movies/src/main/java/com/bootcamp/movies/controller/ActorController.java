package com.bootcamp.movies.controller;

import com.bootcamp.movies.dto.ActorDTO;
import com.bootcamp.movies.model.Actor;
import com.bootcamp.movies.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
@RequiredArgsConstructor
public class ActorController {

    private final ActorService service;

    @GetMapping
    public ResponseEntity<List<ActorDTO>> getAllByFavoriteMovie() {
        return new ResponseEntity<>(service.getAllByFavoriteMovie(), HttpStatus.OK);
    }
}
