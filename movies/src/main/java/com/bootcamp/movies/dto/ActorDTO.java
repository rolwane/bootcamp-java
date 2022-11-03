package com.bootcamp.movies.dto;

import com.bootcamp.movies.model.Actor;
import com.bootcamp.movies.model.Movie;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ActorDTO {
    private String name;
    private Double rating;

    @JsonIgnoreProperties({ "id", "actors" })
    private List<Movie> movies;

    @JsonIgnoreProperties({ "id", "actors" })
    private Movie favoriteMovie;

    public ActorDTO(Actor actor) {
        this.name = actor.getFirstName() + " " + actor.getLastName();
        this.rating = actor.getRating();
        this.movies = actor.getMovies();
        this.favoriteMovie = actor.getFavoriteMovie();
    }
}
