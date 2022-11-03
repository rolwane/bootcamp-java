package com.bootcamp.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "actors")
@Getter
@Setter
@NoArgsConstructor
public class Actor {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String firstName;

    @Column(length = 100, nullable = false)
    private String lastName;

    private double rating;

    @ManyToMany
    @JoinTable(
            name = "actor_movie",
            joinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id")
    )
    @JsonIgnoreProperties("actors")
    private List<Movie> movies;

    @ManyToOne
    @JoinColumn(name = "favorite_movie_id")
    @JsonIgnoreProperties("actors")
    private Movie favoriteMovie;

    @ManyToMany
    @JoinTable(
        name = "actor_episode",
            joinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "episode_id", referencedColumnName = "id")
    )
    @JsonIgnoreProperties("actors")
    private List<Episode> episodes;
}
