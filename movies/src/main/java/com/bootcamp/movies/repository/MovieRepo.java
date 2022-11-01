package com.bootcamp.movies.repository;

import com.bootcamp.movies.dto.MovieDTO;
import com.bootcamp.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

    @Query("SELECT m FROM Movie m")
    List<MovieDTO> getAll();
}
