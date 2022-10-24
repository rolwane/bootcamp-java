package com.bootcamp.storage02.controller;

import com.bootcamp.storage02.model.Subject;
import com.bootcamp.storage02.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getById(@PathVariable long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

}
