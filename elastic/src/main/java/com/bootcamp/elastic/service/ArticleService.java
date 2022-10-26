package com.bootcamp.elastic.service;

import com.bootcamp.elastic.model.Article;
import com.bootcamp.elastic.repository.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService {

    private final ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }
}
