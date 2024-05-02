package com.example.cw4.Dhishacontroller;

import com.example.cw4.Dhishamodel.DhishaCompany;
import com.example.cw4.Dhishaservice.DhishaCompanyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class DhishaCompanyController {

    private static final Logger logger = LoggerFactory.getLogger(DhishaCompanyController.class);

    @Autowired
    private DhishaCompanyService CompanyService;

    @GetMapping
    public ResponseEntity<List<DhishaCompany>> getAllCompanys() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Companies", "N/A");
        List<DhishaCompany> Companys = CompanyService.getAllCompanies();
        return ResponseEntity.ok(Companys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhishaCompany> getCompanyById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/Companies/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Company details", "N/A");
        DhishaCompany Company = CompanyService.getCompanyById(id);
        return ResponseEntity.ok(Company);
    }

    @PostMapping
    public ResponseEntity<DhishaCompany> addCompany(@RequestBody DhishaCompany Company) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Company, HttpStatus.CREATED.value(), "Company added successfully", "N/A");
        DhishaCompany savedCompany = CompanyService.addCompany(Company);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
}