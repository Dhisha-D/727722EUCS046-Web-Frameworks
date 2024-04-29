package com.example.Dhishaday14ce1.Dhishacontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishaday14ce1.Dhishamodel.DhishaEmployee;
import com.example.Dhishaday14ce1.Dhishaservice.DhishaEmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class EmployeeController {
    @Autowired
    DhishaEmployeeService employeeService;

    @PostMapping("/employee")
    public DhishaEmployee addEmployee(@RequestBody DhishaEmployee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<DhishaEmployee> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<DhishaEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
