package com.bootcamp.movies.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Column(length = 500, nullable = false)
    private String title;

    private double rating;

    @Column(length = 10)
    private int awards;

    private LocalDateTime releaseDate;

    @Column(length = 10)
    private int length;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;
}
