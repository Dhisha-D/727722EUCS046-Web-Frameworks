package com.example.day6cw3.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.Dhishamodel.DhishaProduct;

@Repository
public interface DhishaProductRepo extends JpaRepository<DhishaProduct,Integer>{
    
}
