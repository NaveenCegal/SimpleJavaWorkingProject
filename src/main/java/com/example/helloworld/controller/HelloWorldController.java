package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Exception to handle REST errors.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/Testinghello")
    public String sendGreetings() {
        return "Hello, World! ";
    }
}
