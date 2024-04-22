package com.example.dhishacw1.Dhishaservice;

import org.springframework.stereotype.Service;

import com.example.dhishacw1.Dhishamodel.DhishaProduct;
import com.example.dhishacw1.Dhisharepository.DhishaProductRepo;

@Service
public class DhishaProductService {
    public DhishaProductRepo productRepo;
    public DhishaProductService(DhishaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DhishaProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhishaProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DhishaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

