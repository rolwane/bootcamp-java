package com.bootcamp.praticatutoriais.interfaces;

import com.bootcamp.praticatutoriais.model.Tutorial;

import java.util.List;
import java.util.Optional;

public interface ITutorialService {
    Tutorial create(Tutorial tutorial);
    Optional<Tutorial> getById(Long id);
    Tutorial update(Tutorial tutorial);
    List<Tutorial> getAll();
    List<Tutorial> getAllPublished();
    List<Tutorial> getAllByTitle(String title);
    void deleteAll();
    void deleteById(Long id);
}
