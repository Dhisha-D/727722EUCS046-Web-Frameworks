package com.examly.springapp.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Dhishamodel.DhishaStudent;

import java.util.List;

@Repository
public interface DhishaStudentRepo extends JpaRepository<DhishaStudent, Long> {

    List<DhishaStudent> findByMarksGreaterThan(int mark);

    List<DhishaStudent> findByMarksLessThan(int mark);

}
