package com.example.Dhishaq1.Dhishaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishaq1.Dhishamodel.DhishaAuthor;
import com.example.Dhishaq1.Dhishamodel.DhishaBook;
import com.example.Dhishaq1.Dhisharepository.BookRepository;
import com.example.Dhishaq1.Dhisharepository.DhishaDhishaAuthorRepository;

@Service
public class DhishaBookService {
    @Autowired
    private BookRepository bookRepository;
@Autowired
private DhishaDhishaAuthorRepository authorRepository;
    public DhishaBook saveBook(Long authorId, DhishaBook book) {
        DhishaAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public DhishaBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

