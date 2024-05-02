package com.example.cw2.Dhishaservice;

import org.springframework.stereotype.Service;

@Service
public class DhishaMyService {

    public String process(String input) {
        System.out.println("Processing: " + input);
        return "Processed: " + input;
    }
}
