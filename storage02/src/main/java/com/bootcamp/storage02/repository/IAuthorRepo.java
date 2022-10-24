package com.bootcamp.storage02.repository;

import com.bootcamp.storage02.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepo extends JpaRepository<Author, Long> {

}
