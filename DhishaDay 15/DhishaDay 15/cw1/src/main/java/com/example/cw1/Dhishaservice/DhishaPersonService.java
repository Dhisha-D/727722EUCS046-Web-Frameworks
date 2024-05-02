package com.example.cw1.Dhishaservice;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.Dhishamodel.DhishaPerson;
import com.example.cw1.Dhisharepository.DhishaPersonRepo;

@Service
public class DhishaPersonService {
    @Autowired
    private DhishaPersonRepo repo;

    public DhishaPerson createPerson(DhishaPerson person) {
        return repo.save(person);
    }

    public List<DhishaPerson> getAllPersons() {
        return repo.findAll();
    }
}
