package com.example.Dhishaday14ce2.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dhishaday14ce2.Dhishamodel.DhishaBook;

@Repository
public interface DhishaBookRepo extends JpaRepository<DhishaBook,Integer> {
    
}
