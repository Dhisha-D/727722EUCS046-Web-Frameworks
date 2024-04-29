package com.example.Dhishace1.Dhishaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishace1.Dhishamodel.DhishaAddress;
import com.example.Dhishace1.Dhisharepository.DhishaAddressRepo;
import com.example.Dhishace1.Dhisharepository.DhishaEmployeeRepo;

@Service
public class DhishaAddressService {
    @Autowired
    DhishaAddressRepo addressRepo;
    @Autowired
    DhishaEmployeeRepo employeeRepo;
    public Address setAddressById(int id,Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
