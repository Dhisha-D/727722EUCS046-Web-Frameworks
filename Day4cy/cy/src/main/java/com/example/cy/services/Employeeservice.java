package com.example.cy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.cy.model.Employee;
import com.example.cy.repository.Employeerepo;

@Service
public class Employeeservice {
    public Employeerepo employeeRepo;
    public Employeeservice(Employeerepo employeeRepo)
    {
        this.employeeRepo=employeeRepo;
    }
    public boolean saveEmployee(Employee employee)
    {
        try{
            employeeRepo.save(employee);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(int id)
    {
        Optional<Employee> obj = employeeRepo.findById(id);
        return obj.orElse(null);
    }
}
