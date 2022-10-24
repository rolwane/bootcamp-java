package com.bootcamp.storage02.controller;

import com.bootcamp.storage02.model.Author;
import com.bootcamp.storage02.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping
    ResponseEntity<Author> addNewAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(service.addNewAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<Author> getById(@PathVariable long id) {
        Author author = service.getById(id);

        if (author == null) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(author, HttpStatus.OK);
    }
}
