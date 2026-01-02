package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping("/")
    String m1(){
        System.out.println("\n\t server : 127.0.0.1:8080/ ");
        return "i";
    }
    
}
