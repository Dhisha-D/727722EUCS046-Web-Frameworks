package com.examly.class_exercise_1.Dhishacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.Dhishamodel.DhishaPerson;
import com.examly.class_exercise_1.Dhishaservice.DhishaPersonService;

@RestController
public class DhishaPersonController {

     @Autowired
     public DhishaPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<DhishaPerson> postMethodName(@RequestBody DhishaPerson entity) {

          DhishaPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<DhishaPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<DhishaPerson>> getMethodName() {

          List<DhishaPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DhishaPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DhishaPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<DhishaPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}