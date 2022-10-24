package com.bootcamp.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45, nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_subject")
    @JsonIgnoreProperties(value = "books")
    private Subject subject;

    @ManyToMany(mappedBy = "books")
    @JsonIgnoreProperties("books")
    private Set<Author> authors;
}
