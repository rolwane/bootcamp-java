package com.bootcamp.springivpraticablog.dto;

import com.bootcamp.springivpraticablog.model.Blog;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsertedBlogDTO {
    private int insertedId;
    private String message;

    public InsertedBlogDTO(Blog blog) {
        this.setInsertedId(blog.getId());
        this.setMessage("Novo blog inserido com sucesso");
    }
}
