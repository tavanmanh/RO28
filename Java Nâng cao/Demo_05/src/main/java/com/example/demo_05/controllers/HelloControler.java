package com.example.demo_05.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControler {

    @GetMapping
    public String hello(){
        return "hello 1323";
    }
}
