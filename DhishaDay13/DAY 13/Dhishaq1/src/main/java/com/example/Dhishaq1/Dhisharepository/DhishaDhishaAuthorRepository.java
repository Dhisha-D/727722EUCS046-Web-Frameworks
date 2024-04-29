package com.example.Dhishaq1.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dhishaq1.Dhishamodel.DhishaAuthor;
@Repository
public interface DhishaDhishaAuthorRepository extends JpaRepository<DhishaAuthor, Long> {
}
