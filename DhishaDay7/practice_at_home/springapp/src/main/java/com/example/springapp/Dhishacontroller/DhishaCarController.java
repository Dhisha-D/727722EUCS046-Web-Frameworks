package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DhishaCar;
import com.example.springapp.service.DhishaCarService;

@RestController
public class DhishaCarController {
    @Autowired
    private DhishaCarService carService;

    @PostMapping("/api/car")
    public ResponseEntity<DhishaCar> post(@RequestBody DhishaCar car) {
        if (carService.post(car)) {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car")
    public ResponseEntity<List<DhishaCar>> getAll() {
        List<DhishaCar> li = carService.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<DhishaCar> getbyDistinct(@RequestParam String currentOwnerName, @RequestParam String address) {
        DhishaCar car = carService.getByDetails(currentOwnerName, address);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
