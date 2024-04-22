package com.example.day6pah.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6pah.Dhishamodel.DhishaLanguage;

@Repository
public interface DhishaLanguageRepo extends JpaRepository<DhishaLanguage,Integer>{
    
}
