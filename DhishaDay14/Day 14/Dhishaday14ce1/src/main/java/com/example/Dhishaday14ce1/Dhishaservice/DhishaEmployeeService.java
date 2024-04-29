package com.example.Dhishaday14ce1.Dhishaservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishaday14ce1.Dhishamodel.DhishaEmployee;
import com.example.Dhishaday14ce1.Dhisharepository.DhishaEmployeeRepo;

@Service

public class DhishaEmployeeService {
    @Autowired
    DhishaEmployeeRepo employeeRepo;

    public DhishaEmployee addEmployee(DhishaEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DhishaEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<DhishaEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
