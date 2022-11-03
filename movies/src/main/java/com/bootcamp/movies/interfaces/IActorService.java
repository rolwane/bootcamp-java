package com.bootcamp.movies.interfaces;

import com.bootcamp.movies.dto.ActorDTO;
import com.bootcamp.movies.model.Actor;

import java.util.List;

public interface IActorService {
    List<ActorDTO> getAllByFavoriteMovie();
}
