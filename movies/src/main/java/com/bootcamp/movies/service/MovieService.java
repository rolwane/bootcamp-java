package com.bootcamp.movies.service;

import com.bootcamp.movies.dto.MovieDTO;
import com.bootcamp.movies.repository.MovieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService implements IMovieService {

    private final MovieRepo repo;

    @Override
    public List<MovieDTO> getAll() {
        return repo.getAll();
    }
}
