package com.example.question3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.question3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudentDetails() {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Vijay");
        stu.setDescription("This is a student description");
        return stu;
    }

}
