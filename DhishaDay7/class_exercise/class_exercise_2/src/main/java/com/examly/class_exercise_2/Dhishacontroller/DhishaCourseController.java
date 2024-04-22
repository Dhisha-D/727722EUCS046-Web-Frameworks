package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.DhishaCourse;
import com.examly.class_exercise_2.service.DhishaCourseService;

@RestController
public class DhishaCourseController {

     @Autowired
     public DhishaCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<DhishaCourse> postMethodName(@RequestBody DhishaCourse entity) {

          DhishaCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<DhishaCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<DhishaCourse>> getMethodName() {

          List<DhishaCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DhishaCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DhishaCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<DhishaCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}