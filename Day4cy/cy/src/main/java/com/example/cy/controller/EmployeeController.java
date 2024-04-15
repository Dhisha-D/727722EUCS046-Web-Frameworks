package com.example.cy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy.model.Employee;
import com.example.cy.services.Employeeservice;

@RestController
public class EmployeeController {
    public Employeeservice employeeService;
    public EmployeeController(Employeeservice employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public ResponseEntity<Employee> postMethodName(@RequestBody Employee employee) {
        if(employeeService.saveEmployee(employee))
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/employee")
    public ResponseEntity<List<Employee>> getMethodName() {
        List<Employee> list =  employeeService.getEmployees();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @GetMapping("/api/employee/{employeeId}")
    public ResponseEntity<Employee> getMethodName(@PathVariable("employeeId") int id) {
        Employee p =  employeeService.getEmployeeById(id);
        if(p==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(p,HttpStatus.OK);
    }
}

