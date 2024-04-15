package com.example.cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cy.model.Employee;


@Repository
public interface Employeerepo extends JpaRepository<Employee,Integer>{
    
}

