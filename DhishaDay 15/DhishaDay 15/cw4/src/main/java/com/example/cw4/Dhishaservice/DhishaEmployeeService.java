package com.example.cw4.Dhishaservice;

import com.example.cw4.Dhishamodel.DhishaEmployee;
import com.example.cw4.Dhisharepository.DhishaEmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhishaEmployeeService {

    @Autowired
    private DhishaEmployeeRepository employeeRepository;

    public List<DhishaEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public DhishaEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public DhishaEmployee addEmployee(DhishaEmployee employee) {
        return employeeRepository.save(employee);
    }
}