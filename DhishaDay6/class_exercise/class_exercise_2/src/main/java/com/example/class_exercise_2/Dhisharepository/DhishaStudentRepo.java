package com.example.class_exercise_2.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.Dhishamodel.DhishaStudent;

@Repository
public interface DhishaStudentRepo extends JpaRepository<DhishaStudent, Integer> {

}