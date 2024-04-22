package com.example.springapp.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Dhishamodel.DhishaPerson;
import com.example.springapp.Dhisharepository.DhishaPersonRepo;

@Service
public class DhishaPersonService {
    @Autowired
    private DhishaPersonRepo rep;

    public boolean post(DhishaPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DhishaPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DhishaPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
