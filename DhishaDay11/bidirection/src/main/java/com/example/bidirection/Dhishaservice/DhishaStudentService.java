package com.example.bidirection.Dhishaservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.Dhishamodel.Student;
import com.example.bidirection.Dhisharepository.DhishaStudentInfoRepository;
import com.example.bidirection.Dhisharepository.DhishaStudentRepository;
import com.example.bidirection.Dhishamodel.DhishaStudentInfo;

@Service
public class DhishaStudentService {
    public DhishaStudentRepository studentRepository;
    public DhishaStudentInfoRepository studentInfoRepository;
    public DhishaStudentService(DhishaStudentRepository studentRepository,DhishaStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public DhishaStudentInfo saveStudentInfo(DhishaStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}
