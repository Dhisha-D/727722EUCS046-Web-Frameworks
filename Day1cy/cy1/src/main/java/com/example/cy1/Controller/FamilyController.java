package com.example.cy1.Controller;


import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy1.Model.Family;


@RestController
public class FamilyController {
    @GetMapping("/family")
    public List<Family> method1()
    {
        List<Family> li=new LinkedList<>();
        Family f=new Family();
        f.setName("John");
        f.setAge(30);
        f.setRelation("Brother");
        li.add(f);
        return li;

    }
}


