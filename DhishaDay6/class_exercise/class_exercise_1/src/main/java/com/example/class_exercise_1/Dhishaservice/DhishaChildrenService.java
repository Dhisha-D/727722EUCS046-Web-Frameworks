package com.example.class_exercise_1.Dhishaservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Dhishamodel.DhishaChildren;
import com.example.class_exercise_1.Dhisharepository.DhishaChildrenRepo;

@Service
public class DhishaChildrenService {

     @Autowired
     public DhishaChildrenRepo childrenRepo;

     public List<DhishaChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public DhishaChildren save(DhishaChildren children) {
          return childrenRepo.save(children);

     }

     public List<DhishaChildren> sortedPage(int offset, int pagesize, String field) {
          Page<DhishaChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<DhishaChildren> pagination(int offset, int pagesize) {
          Page<DhishaChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
