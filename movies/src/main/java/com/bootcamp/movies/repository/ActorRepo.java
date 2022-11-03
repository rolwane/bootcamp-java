package com.bootcamp.movies.repository;

import com.bootcamp.movies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepo extends JpaRepository<Actor, Integer> {
    @Query(value = "SELECT * FROM actors WHERE favorite_movie_id IS NOT NULL", nativeQuery = true)
    List<Actor> findAllWithFavoriteMovie();
}
