package com.example.springapp.Dhisharepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Dhishamodel.DhishaPerson;

public interface DhishaPersonRepo extends JpaRepository<DhishaPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<DhishaPerson> findByAge(int age);
}
