package com.example.dhishacw2.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dhishacw2.Dhishamodel.DhishaEmployee;


@Repository
public interface DhishaEmployeeRepo extends JpaRepository<DhishaEmployee,Integer>{
    
}

