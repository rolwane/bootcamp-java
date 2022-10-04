package com.bootcamp.springivpraticablog.controller;

import com.bootcamp.springivpraticablog.dto.InsertedBlogDTO;
import com.bootcamp.springivpraticablog.model.Blog;
import com.bootcamp.springivpraticablog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService service;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogs() {
        return new ResponseEntity<>(service.getBlogs(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<InsertedBlogDTO> addBlog(@RequestBody Blog blog) {
        service.addBlog(blog);
        return new ResponseEntity<>(new InsertedBlogDTO(blog), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getById(@PathVariable int id) {
        Blog foundBlog = service.getById(id);

        return new ResponseEntity<>(foundBlog, HttpStatus.OK);
    }
}
