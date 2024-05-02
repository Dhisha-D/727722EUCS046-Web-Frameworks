package com.example.cw4.Dhishacontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.cw4.Dhishamodel.DhishaEmployee;
import com.example.cw4.Dhishaservice.DhishaEmployeeService;

@RestController
@RequestMapping("/employees")
public class DhishaEmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(DhishaEmployeeController.class);

    @Autowired
    private DhishaEmployeeService EmployeeService;

    @GetMapping
    public ResponseEntity<List<DhishaEmployee>> getAllEmployees() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Employees", "N/A");
        List<DhishaEmployee> Employees = EmployeeService.getAllEmployees();
        return ResponseEntity.ok(Employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhishaEmployee> getEmployeeById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Employee details", "N/A");
        DhishaEmployee Employee = EmployeeService.getEmployeeById(id);
        return ResponseEntity.ok(Employee);
    }

    @PostMapping
    public ResponseEntity<DhishaEmployee> addEmployee(@RequestBody DhishaEmployee Employee) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Employee, HttpStatus.CREATED.value(), "Employee added successfully", "N/A");
        DhishaEmployee savedEmployee = EmployeeService.addEmployee(Employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}