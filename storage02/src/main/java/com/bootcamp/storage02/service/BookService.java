package com.bootcamp.storage02.service;

import com.bootcamp.storage02.model.Book;
import com.bootcamp.storage02.repository.IBookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {

    private final IBookRepo repo;

    @Override
    public Book getById(long id) {
        Optional<Book> book = repo.findById(id);

        if (book.isPresent()) {
            return book.get();
        }

        return null;
    }
}
