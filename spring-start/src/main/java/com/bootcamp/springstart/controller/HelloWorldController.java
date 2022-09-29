package com.bootcamp.springstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String getHello() {
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    public String getHelloPerson(@PathVariable String name) {
        return "Olá, " + name + "!";
    }
}
