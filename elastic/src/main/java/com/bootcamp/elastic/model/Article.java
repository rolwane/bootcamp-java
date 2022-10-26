package com.bootcamp.elastic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "blog")
@Getter
@Setter
public class Article {

    @Id
    private int id;
    private String title;
}
