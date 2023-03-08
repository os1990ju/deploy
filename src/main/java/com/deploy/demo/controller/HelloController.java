package com.deploy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@Value("${app.name}")
    //String message;
    @GetMapping("/hello")
    public String hello() {
        return "Hello ";
    }
}
