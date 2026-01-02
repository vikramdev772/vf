package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import com.example.myapp.DTO.Fruit;

@RestController
public class Main {
    @GetMapping("/f")
    Fruit m1() {
        return new Fruit();

    }

    @GetMapping("/a")
    String m2() {
        return "Hello world ";
    }

}
