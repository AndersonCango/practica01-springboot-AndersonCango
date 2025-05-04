package com.app.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloRestController {
    
    @GetMapping("/hello-rest")
    public String helloRest() {
        return "Hello Rest Controller";
    }
    
}
