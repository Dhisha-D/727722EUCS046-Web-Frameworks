package com.example.relation.Dhishaservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.Dhishamodel.Student;
import com.example.relation.Dhisharepository.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
