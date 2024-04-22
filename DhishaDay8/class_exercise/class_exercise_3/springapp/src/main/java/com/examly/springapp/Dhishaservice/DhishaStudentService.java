package com.examly.springapp.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Dhishamodel.DhishaStudent;
import com.examly.springapp.Dhisharepository.DhishaStudentRepo;

@Service
public class DhishaStudentService {
    @Autowired
    private DhishaStudentRepo studentRepo;

    public boolean post(DhishaStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DhishaStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<DhishaStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
