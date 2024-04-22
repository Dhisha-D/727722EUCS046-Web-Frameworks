package com.example.class_exercise_2.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.Dhishamodel.DhishaStudent;
import com.example.class_exercise_2.Dhisharepository.DhishaStudentRepo;

@Service
public class DhishaStudentService {

     @Autowired
     public DhishaStudentRepo studentRepo;

     public List<DhishaStudent> getAll() {
          return studentRepo.findAll();
     }

     public DhishaStudent post(DhishaStudent student) {
          return studentRepo.save(student);
     }

     public List<DhishaStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
