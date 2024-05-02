package com.example.cw4.Dhishaservice;

import com.example.cw4.Dhishamodel.DhishaCompany;
import com.example.cw4.Dhisharepository.DhishaCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhishaCompanyService {

    @Autowired
    private DhishaCompanyRepository companyRepository;

    public List<DhishaCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public DhishaCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public DhishaCompany addCompany(DhishaCompany company) {
        return companyRepository.save(company);
    }
}