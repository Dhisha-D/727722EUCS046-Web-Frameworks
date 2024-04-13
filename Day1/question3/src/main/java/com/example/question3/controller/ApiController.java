package com.example.question3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
     @GetMapping("/favouriteColor")
     public String getColor(@RequestParam(name="color") String color){
     return "My favourite color is " +color +"!";
     }
}
