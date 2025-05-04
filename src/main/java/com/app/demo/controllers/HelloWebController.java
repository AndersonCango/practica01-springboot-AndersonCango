package com.app.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWebController {
    
    @GetMapping("/hello-web")
    public String helloWeb() {
        return "hello";
    }
    
}
