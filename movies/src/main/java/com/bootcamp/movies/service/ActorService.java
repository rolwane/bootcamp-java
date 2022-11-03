package com.bootcamp.movies.service;

import com.bootcamp.movies.dto.ActorDTO;
import com.bootcamp.movies.interfaces.IActorService;
import com.bootcamp.movies.model.Actor;
import com.bootcamp.movies.repository.ActorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActorService implements IActorService {

    private final ActorRepo repo;

    @Override
    public List<ActorDTO> getAllByFavoriteMovie() {
        return repo.findAllWithFavoriteMovie().stream().map(ActorDTO::new).collect(Collectors.toList());
    }
}
