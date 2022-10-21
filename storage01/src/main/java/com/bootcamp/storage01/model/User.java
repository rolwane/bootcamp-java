package com.bootcamp.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity // Indica que esta classe será persistida no banco de dados
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o cod vai ser auto_increment
    private long cod;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 45, unique = true)
    private String email;
}
