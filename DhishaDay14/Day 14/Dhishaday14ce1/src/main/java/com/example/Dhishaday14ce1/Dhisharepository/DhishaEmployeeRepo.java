package com.example.Dhishaday14ce1.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dhishaday14ce1.Dhishamodel.DhishaEmployee;

@Repository
public interface DhishaEmployeeRepo extends JpaRepository<DhishaEmployee,Long> {
    
}
