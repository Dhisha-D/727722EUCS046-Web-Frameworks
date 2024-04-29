package com.example.Dhishace1.Dhisharepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Dhishace1.Dhishamodel.DhishaEmployee;

public interface DhishaEmployeeRepo extends JpaRepository<Employee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Employee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<Employee> getByLeftOuterEmployees();
}