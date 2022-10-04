package com.bootcamp.springivpraticablog.service;

import com.bootcamp.springivpraticablog.model.Blog;
import com.bootcamp.springivpraticablog.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepo repo;

    public List<Blog> getBlogs() {
        return repo.getBlogs();
    }

    public void addBlog(Blog blog) {
        repo.addBlog(blog);
    }

    public Blog getById(int id) {
        return repo.getById(id);
    }
}
