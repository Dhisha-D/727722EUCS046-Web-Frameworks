package com.example.Dhishaq1.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishaq1.Dhishamodel.DhishaAuthor;
import com.example.Dhishaq1.Dhisharepository.DhishaDhishaAuthorRepository;

@Service
public class DhishaAuthorService {
    @Autowired
    private DhishaDhishaAuthorRepository authorRepository;

    public DhishaAuthor saveAuthor(DhishaAuthor author) {
        return authorRepository.save(author);
    }

    public DhishaAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<DhishaAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public DhishaAuthor updateAuthor(Long id, DhishaAuthor author) {
        DhishaAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
