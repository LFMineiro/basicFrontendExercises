package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*" )
public class formController {
    @PostMapping("/notes")
    public String submit(
        @RequestBody String nota
        ) {
        return nota;
    }
    
}
