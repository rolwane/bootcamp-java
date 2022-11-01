package com.bootcamp.movies.service;

import com.bootcamp.movies.dto.MovieDTO;
import com.bootcamp.movies.model.Movie;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> getAll();
}
