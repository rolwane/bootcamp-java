package com.bootcamp.movies.dto;

import com.bootcamp.movies.model.Actor;
import com.bootcamp.movies.model.Genre;
import com.bootcamp.movies.model.Movie;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class MovieDTO {
    private String title;
    private String genre;
    private LocalDateTime releaseDate;
    private double rating;
    private int awards;
    private Integer length;

    @JsonIgnoreProperties({ "id", "movies", "rating", "movie" })
    private List<Actor> actors;

    public MovieDTO(Movie movie) {
        this.setTitle(movie.getTitle());
        this.setGenre(movie.getGenre());
        this.setReleaseDate(movie.getReleaseDate());
        this.setRating(movie.getRating());
        this.setAwards(movie.getAwards());
        this.setLength(movie.getLength());
        this.setActors(movie.getActors());
    }

    public void setGenre(Genre genre) {
        if (genre == null) {
            this.genre = null;
            return;
        }

        this.genre = genre.getName();
    }
}
