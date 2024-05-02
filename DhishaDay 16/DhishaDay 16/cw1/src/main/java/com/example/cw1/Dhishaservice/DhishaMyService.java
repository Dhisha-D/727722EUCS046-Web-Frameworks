package com.example.cw1.Dhishaservice;

import org.springframework.stereotype.Service;

@Service
public class DhishaMyService {

    public void doSomething() {
        System.out.println("Around advice: Executing after doSomething()");
    }
}
