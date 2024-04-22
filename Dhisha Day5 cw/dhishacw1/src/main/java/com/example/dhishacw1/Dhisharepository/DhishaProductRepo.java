package com.example.dhishacw1.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dhishacw1.Dhishamodel.DhishaProduct;

@Repository
public interface DhishaProductRepo extends JpaRepository<DhishaProduct,Integer>{
    
}

