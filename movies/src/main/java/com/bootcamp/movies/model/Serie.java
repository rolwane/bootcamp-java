package com.bootcamp.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "series")
@Getter
@Setter
@NoArgsConstructor
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private int id;

    @Column(length = 500, nullable = false)
    private String title;

    private LocalDateTime releaseDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @JsonIgnoreProperties("series")
    private Genre genre;

    @OneToMany(mappedBy = "serie")
    @JsonIgnoreProperties("serie")
    private List<Season> seasons;
}
