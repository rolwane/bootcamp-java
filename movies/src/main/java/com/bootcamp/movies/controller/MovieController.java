package com.bootcamp.movies.controller;

import com.bootcamp.movies.dto.MovieDTO;
import com.bootcamp.movies.model.Movie;
import com.bootcamp.movies.service.IMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final IMovieService service;

    @GetMapping
    public ResponseEntity<List<MovieDTO>> pegarTodos() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
