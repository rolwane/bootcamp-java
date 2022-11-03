package com.bootcamp.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "episodes")
@Getter
@Setter
@NoArgsConstructor
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private int id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 10)
    private Integer number;

    private LocalDateTime releaseDate;
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "season_id")
    @JsonIgnoreProperties("episodes")
    private Season season;

    @ManyToMany(mappedBy = "episodes")
    @JsonIgnoreProperties("episodes")
    private List<Actor> actors;
}
