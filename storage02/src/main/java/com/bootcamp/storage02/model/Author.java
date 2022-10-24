package com.bootcamp.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45, nullable = false)
    private String name;

    @OneToOne(mappedBy = "author")
    @JsonIgnoreProperties(value = "author")
    private Address address;

    @ManyToMany
    @JsonIgnoreProperties("authors")
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "id_author", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id")
    )
    private Set<Book> books;
}
