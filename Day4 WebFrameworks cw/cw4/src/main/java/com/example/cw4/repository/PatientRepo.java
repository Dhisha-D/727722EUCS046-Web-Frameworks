package com.example.cw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cw4.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{
    
}
