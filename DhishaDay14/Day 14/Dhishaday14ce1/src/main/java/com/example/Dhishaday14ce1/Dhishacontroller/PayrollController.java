package com.example.Dhishaday14ce1.Dhishacontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishaday14ce1.Dhishamodel.DhishaPayroll;
import com.example.Dhishaday14ce1.Dhishaservice.DhishaPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PayrollController {
    @Autowired
    DhishaPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public DhishaPayroll addPayroll(@PathVariable Long employeeId,@RequestBody DhishaPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<DhishaPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
