package com.example.class_exercise_2.Dhishacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.Dhishamodel.DhishaStudent;
import com.example.class_exercise_2.Dhishaservice.DhishaStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DhishaStudentController {

     @Autowired
     public DhishaStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<DhishaStudent>> getDetails() {
          List<DhishaStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<DhishaStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DhishaStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<DhishaStudent> postMethodName(@RequestBody DhishaStudent student) {

          DhishaStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<DhishaStudent>> sortedDetails(@PathVariable String field) {
          List<DhishaStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<DhishaStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DhishaStudent>>(list, HttpStatus.OK);

     }
}
