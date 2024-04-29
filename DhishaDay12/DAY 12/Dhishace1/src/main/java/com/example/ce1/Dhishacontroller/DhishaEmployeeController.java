package com.example.Dhishace1.Dhishacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishace1.Dhishamodel.DhishaEmployee;
import com.example.Dhishace1.Dhishaservice.DhishaEmployeeService;

@RestController
public class DhishaEmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee setMethod(@RequestBody Employee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DhishaEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DhishaEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
