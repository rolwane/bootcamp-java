package com.bootcamp.storage02.controller;

import com.bootcamp.storage02.model.Book;
import com.bootcamp.storage02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable long id) {
        Book foundBook = service.getById(id);

        if (foundBook == null) {
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(foundBook, HttpStatus.OK);
    }
}
