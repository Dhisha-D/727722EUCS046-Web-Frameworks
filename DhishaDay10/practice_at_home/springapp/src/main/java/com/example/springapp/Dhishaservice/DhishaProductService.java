package com.example.springapp.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Dhishamodel.DhishaProduct;
import com.example.springapp.Dhisharepository.DhishaProductRepo;

@Service
public class DhishaProductService {
    @Autowired
    private DhishaProductRepo productRepo;

    public boolean saveProduct(DhishaProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<DhishaProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public DhishaProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public DhishaProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}