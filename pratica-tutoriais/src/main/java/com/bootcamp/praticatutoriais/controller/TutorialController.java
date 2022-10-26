package com.bootcamp.praticatutoriais.controller;

import com.bootcamp.praticatutoriais.enums.Status;
import com.bootcamp.praticatutoriais.interfaces.ITutorialService;
import com.bootcamp.praticatutoriais.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

    @Autowired
    private ITutorialService service;

    @PostMapping
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        return new ResponseEntity<>(service.create(tutorial), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}/published")
    public ResponseEntity<Tutorial> updateStatusToPublished(@PathVariable Long id) {
        Optional<Tutorial> optional = service.getById(id);

        if (optional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        Tutorial tutorial = optional.get();

        tutorial.setStatus(Status.PUBLISHED);

        return new ResponseEntity<>(service.update(tutorial), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Tutorial>> getAllByTitle(@RequestParam String title) {
        return new ResponseEntity<>(service.getAllByTitle(title), HttpStatus.OK);
    }

    @GetMapping("/published")
    public ResponseEntity<List<Tutorial>> getAllPublished() {
        return new ResponseEntity<>(service.getAllPublished(), HttpStatus.OK);
    }
}
