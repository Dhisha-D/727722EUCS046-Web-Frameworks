package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DhishaUser;
import com.example.springapp.service.DhishaUserService;

@RestController
@RequestMapping("/api")
public class DhishaUserController {
    
    @Autowired
    private DhishaUserService userService;

    @PostMapping("/user")
    public ResponseEntity<DhishaUser> post(@RequestBody DhishaUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<DhishaUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<DhishaUser> getById(@PathVariable int userId)
    {
        DhishaUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DhishaUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<DhishaUser> getByUserName(@PathVariable String userName)
    {
        DhishaUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<DhishaUser>(user, HttpStatus.OK);
        }
    }
}
