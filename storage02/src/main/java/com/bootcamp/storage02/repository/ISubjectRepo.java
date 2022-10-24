package com.bootcamp.storage02.repository;

import com.bootcamp.storage02.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject, Long> {
}
