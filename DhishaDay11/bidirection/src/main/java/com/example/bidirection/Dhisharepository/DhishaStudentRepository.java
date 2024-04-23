package com.example.bidirection.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Dhishamodel.Student;



@Repository
public interface DhishaStudentRepository extends JpaRepository<Student,Integer>{
    
}
