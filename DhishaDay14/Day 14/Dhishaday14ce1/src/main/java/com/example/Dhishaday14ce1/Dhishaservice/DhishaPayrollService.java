package com.example.Dhishaday14ce1.Dhishaservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishaday14ce1.Dhishamodel.DhishaPayroll;
import com.example.Dhishaday14ce1.Dhisharepository.DhishaPayrollRepo;

@Service
public class DhishaPayrollService {
    @Autowired
    DhishaPayrollRepo payrollRepo;

    public DhishaPayroll addPayroll(Long id,DhishaPayroll payroll)
    {
        DhishaPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<DhishaPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
