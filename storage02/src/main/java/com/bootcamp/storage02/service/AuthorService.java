package com.bootcamp.storage02.service;

import com.bootcamp.storage02.model.Author;
import com.bootcamp.storage02.repository.IAuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {

    private final IAuthorRepo repo;

    @Override
    public Author addNewAuthor(Author author) {
        return repo.save(author);
    }

    @Override
    public Author getById(long id) {
        Optional<Author> authorOptional = repo.findById(id);

        if (authorOptional.isPresent()) {
            return authorOptional.get();
        }

        return null; // aqui é melhor levantar uma exception do que retornar null
    }
}
