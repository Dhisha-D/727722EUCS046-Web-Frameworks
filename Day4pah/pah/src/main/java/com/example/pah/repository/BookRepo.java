package com.example.pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pah.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{
    
}

