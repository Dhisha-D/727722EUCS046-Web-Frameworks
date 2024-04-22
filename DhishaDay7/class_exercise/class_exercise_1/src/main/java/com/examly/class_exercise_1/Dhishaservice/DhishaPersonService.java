package com.examly.class_exercise_1.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.Dhishamodel.DhishaPerson;
import com.examly.class_exercise_1.Dhisharepository.DhishaPersonRepo;

@Service
public class DhishaPersonService {

     @Autowired
     public DhishaPersonRepo personRepo;

     public DhishaPerson SaveEntity(DhishaPerson entity) {
          return personRepo.save(entity);

     }

     public List<DhishaPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<DhishaPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
