package com.example.dhishacw2.Dhishaservice;

import org.springframework.stereotype.Service;

import com.example.dhishacw2.Dhishamodel.DhishaEmployee;
import com.example.dhishacw2.Dhisharepository.DhishaEmployeeRepo;

@Service
public class DhishaEmployeeService {
    public DhishaEmployeeRepo employeeRepo;
    public DhishaEmployeeService(DhishaEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(DhishaEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhishaEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public DhishaEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
