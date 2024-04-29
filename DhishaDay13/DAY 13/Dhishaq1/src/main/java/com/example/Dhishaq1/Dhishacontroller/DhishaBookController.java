package com.example.Dhishaq1.Dhishacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishaq1.Dhishamodel.DhishaBook;
import com.example.Dhishaq1.Dhishaservice.DhishaBookService;

@RestController
public class DhishaBookController {
    @Autowired
    private DhishaBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<DhishaBook> getBookById(@PathVariable Long bookId) {
        DhishaBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
