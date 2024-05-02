package com.example.cw3.Dhishaservice;

import com.example.cw3.Dhishamodel.DhishaProduct;
import com.example.cw3.Dhisharepository.DhishaProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private DhishaProductRepo productRepo;

    public List<DhishaProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public DhishaProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public DhishaProduct addProduct(DhishaProduct product) {
        return productRepo.save(product);
    }
}