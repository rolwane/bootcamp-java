package com.bootcamp.storage02.repository;

import com.bootcamp.storage02.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Long> {
}
