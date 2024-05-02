package com.example.cw4.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cw4.Dhishamodel.DhishaCompany;

@Repository
public interface DhishaCompanyRepository extends JpaRepository<DhishaCompany, Integer> {
}