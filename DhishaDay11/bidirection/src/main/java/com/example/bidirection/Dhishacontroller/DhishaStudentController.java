package com.example.bidirection.Dhishacontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.Dhishamodel.Student;
import com.example.bidirection.Dhishaservice.DhishaStudentService;
import com.example.bidirection.Dhishamodel.DhishaStudentInfo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DhishaStudentController {
    public DhishaStudentService studentService;
    public DhishaStudentController(DhishaStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DhishaStudentInfo postMethodName(@RequestBody DhishaStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}