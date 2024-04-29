package com.example.Dhishaday14ce2.Dhishacontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishaday14ce2.Dhishamodel.DhishaBook;
import com.example.Dhishaday14ce2.Dhishaservice.DhishaBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class BookController {
    @Autowired
    DhishaBookService bookService;

    @PostMapping("/api/book")
    public DhishaBook addBook(@RequestBody DhishaBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public DhishaBook updateBook(@PathVariable int id,@RequestBody DhishaBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<DhishaBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<DhishaBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
