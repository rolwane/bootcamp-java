package com.bootcamp.springivpraticablog.repository;

import com.bootcamp.springivpraticablog.exception.IdAlreadyRegisteredException;
import com.bootcamp.springivpraticablog.exception.NotFoundException;
import com.bootcamp.springivpraticablog.model.Blog;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BlogRepo {
    private final List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void addBlog(Blog blog) {
        List<Blog> filteredList = blogs.stream()
                .filter((currentBlog) -> currentBlog.getId() == blog.getId())
                        .collect(Collectors.toList());

        if (!filteredList.isEmpty()) {
            throw new IdAlreadyRegisteredException("Um blog com o ID informado já está cadastrado.");
        }

        blogs.add(blog);
    }

    public Blog getById(int id) {
        Optional<Blog> foundBlog = this.blogs.stream().filter((blog) -> blog.getId() == id).findFirst();

        if (foundBlog.isEmpty()) {
            throw new NotFoundException("Blog não encontrado");
        }

        return foundBlog.get();
    }
}
