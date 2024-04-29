package com.example.Dhishaday14ce2.Dhishaservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dhishaday14ce2.Dhishamodel.DhishaBook;
import com.example.Dhishaday14ce2.Dhisharepository.DhishaBookRepo;

@Service
public class DhishaBookService {
   @Autowired
   DhishaBookRepo bookRepo;

   public DhishaBook addBook(DhishaBook book)
   {
        return bookRepo.save(book);
   }

   public List<DhishaBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<DhishaBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public DhishaBook updateBook(int id,DhishaBook book)
   {
        DhishaBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
