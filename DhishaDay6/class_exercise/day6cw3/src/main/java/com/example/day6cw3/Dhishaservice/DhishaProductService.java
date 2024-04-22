package com.example.day6cw3.Dhishaservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.Dhishamodel.DhishaProduct;
import com.example.day6cw3.Dhisharepository.DhishaProductRepo;

@Service
public class DhishaProductService {
    public DhishaProductRepo productRepo;
    public DhishaProductService(DhishaProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(DhishaProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhishaProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<DhishaProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public DhishaProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
