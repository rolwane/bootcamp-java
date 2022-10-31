package com.bootcamp.movies.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "genres")
@Getter
@Setter
@NoArgsConstructor
public class Genre {
    @Id
    @Column(length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 10)
    private int ranking;

    @OneToMany(mappedBy = "genre")
    private List<Movie> movies;
}
