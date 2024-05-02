package com.example.cw3.Dhisharepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw3.Dhishamodel.DhishaProduct;

public interface DhishaProductRepo extends JpaRepository<DhishaProduct, Integer>{
    
}