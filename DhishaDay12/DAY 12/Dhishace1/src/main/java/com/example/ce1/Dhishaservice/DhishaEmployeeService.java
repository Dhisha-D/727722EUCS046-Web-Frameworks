package com.example.Dhishace1.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishace1.Dhishamodel.DhishaEmployee;
import com.example.Dhishace1.Dhisharepository.DhishaEmployeeRepo;

@Service
public class DhishaEmployeeService {
    @Autowired
    DhishaEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public Employee setEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DhishaEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DhishaEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
