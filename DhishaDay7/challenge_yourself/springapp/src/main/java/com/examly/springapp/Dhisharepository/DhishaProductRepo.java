package com.examly.springapp.Dhisharepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Dhishamodel.DhishaProduct;

@Repository
public interface DhishaProductRepo extends JpaRepository<DhishaProduct, Integer> {

    public List<DhishaProduct> findByProductCategory(String productCategory);
    public List<DhishaProduct> findByPriceCategory(String priceCategory);

}
