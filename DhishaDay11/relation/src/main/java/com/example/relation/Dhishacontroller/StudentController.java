package com.example.relation.Dhishacontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.Dhishamodel.Student;
import com.example.relation.Dhishaservice.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}
