package com.bootcamp.praticatutoriais.repository;

import com.bootcamp.praticatutoriais.enums.Status;
import com.bootcamp.praticatutoriais.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByStatus(Status status);
}
