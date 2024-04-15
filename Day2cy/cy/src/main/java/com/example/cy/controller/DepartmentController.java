package com.example.cy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy.model.Department;

@RestController
public class DepartmentController {
   @GetMapping("/department")
   public Department m1()
   {
    Department d=new Department();
    d.setDeptname("CSE");
    d.setBranch("BE");
    return d;
    
   } 
}
