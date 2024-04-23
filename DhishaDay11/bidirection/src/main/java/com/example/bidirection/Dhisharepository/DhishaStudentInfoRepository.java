package com.example.bidirection.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Dhishamodel.DhishaStudentInfo;

@Repository
public interface DhishaStudentInfoRepository extends JpaRepository<DhishaStudentInfo,Integer>{
    
}