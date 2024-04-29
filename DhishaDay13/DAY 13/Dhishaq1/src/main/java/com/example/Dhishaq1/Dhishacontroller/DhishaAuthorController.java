package com.example.Dhishaq1.Dhishacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dhishaq1.Dhishamodel.DhishaAuthor;
import com.example.Dhishaq1.Dhishamodel.DhishaBook;
import com.example.Dhishaq1.Dhishaservice.DhishaAuthorService;
import com.example.Dhishaq1.Dhishaservice.DhishaBookService;

@RestController
public class DhishaAuthorController {
    @Autowired
    private DhishaAuthorService authorService;
@Autowired
private DhishaBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<DhishaAuthor> createAuthor(@RequestBody DhishaAuthor author) {
        DhishaAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<DhishaBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody DhishaBook book) {
        DhishaBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<DhishaAuthor> getAuthorById(@PathVariable Long authorId) {
        DhishaAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<DhishaAuthor>> getAllAuthors() {
        List<DhishaAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<DhishaAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody DhishaAuthor author) {
        DhishaAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
