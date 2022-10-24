package com.bootcamp.storage02.service;

import com.bootcamp.storage02.model.Author;

public interface IAuthorService {
    Author addNewAuthor(Author author);

    Author getById(long id);
}
