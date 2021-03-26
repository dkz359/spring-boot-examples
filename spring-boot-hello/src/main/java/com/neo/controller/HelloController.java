package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        return "Spring Boot 2.0!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot 2.0!";
    }
}