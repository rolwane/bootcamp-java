package com.bootcamp.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "seasons")
@Getter
@Setter
@NoArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private int id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 10)
    private Integer number;

    private LocalDateTime releaseDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    @JsonIgnoreProperties("seasons")
    private Serie serie;

    @OneToMany(mappedBy = "season")
    @JsonIgnoreProperties("season")
    private List<Episode> episodes;
}
