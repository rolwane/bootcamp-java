package com.bootcamp.elastic.repository;

import com.bootcamp.elastic.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {

}
