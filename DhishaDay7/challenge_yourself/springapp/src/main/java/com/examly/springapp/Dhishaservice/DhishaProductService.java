package com.examly.springapp.Dhishaservice;

import com.examly.springapp.Dhishamodel.DhishaProduct;
import com.examly.springapp.Dhisharepository.DhishaProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DhishaProductService {
    @Autowired
    DhishaProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(DhishaProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DhishaProduct> getAll() {
        return repo.findAll();

    }

    public List<DhishaProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<DhishaProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
