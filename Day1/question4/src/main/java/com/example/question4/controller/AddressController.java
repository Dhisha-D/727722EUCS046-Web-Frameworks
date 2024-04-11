package com.example.question4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("Dhisha");
        obj.setDoorNo(123);
        obj.setStreetName("Main St");
        obj.setPincode(636701);
        obj.setArea("Gandhi Nagar");
        obj.setDistrict("Dharmapuri");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}


