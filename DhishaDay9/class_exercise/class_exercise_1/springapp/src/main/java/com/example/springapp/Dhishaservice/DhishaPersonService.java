package com.example.springapp.Dhishaservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Dhishamodel.DhishaPerson;
import com.example.springapp.Dhisharepository.DhishaPersonRepo;

@Service
public class DhishaPersonService {
    public DhishaPersonRepo personRepo;

    public DhishaPersonService(DhishaPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DhishaPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DhishaPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
