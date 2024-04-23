package com.example.relation.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Dhishamodel.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
