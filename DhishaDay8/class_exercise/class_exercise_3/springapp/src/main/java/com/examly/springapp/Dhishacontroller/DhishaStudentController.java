package com.examly.springapp.Dhishacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.examly.springapp.Dhishamodel.DhishaStudent;
import com.examly.springapp.Dhishaservice.DhishaStudentService;

@RestController
public class DhishaStudentController {
    @Autowired
    private DhishaStudentService studentService;

    @PostMapping("/Student")
    public ResponseEntity<DhishaStudent> post(@RequestBody DhishaStudent student) {
        if (studentService.post(student)) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Student/marksGreaterThan/{mark}")
    public ResponseEntity<List<DhishaStudent>> getAll(@PathVariable int mark) {
        List<DhishaStudent> li = studentService.start(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Student/marksLessThan/{mark}")
    public ResponseEntity<List<DhishaStudent>> getbyAge(@PathVariable int mark) {
        List<DhishaStudent> li = studentService.end(mark);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
