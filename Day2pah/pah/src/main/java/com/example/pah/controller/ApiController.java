package com.example.pah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pah.config.AppConfig;


@RestController
public class ApiController {
    private final AppConfig obj;
    @Autowired
    public ApiController(AppConfig obj)
    {
        this.obj=obj;
    }
    @GetMapping("/info")
    public String getmessage()
    {
        return "StudentName: "+obj.getstudentName()+",Department: "+obj.getstudentdept();
    }
}

