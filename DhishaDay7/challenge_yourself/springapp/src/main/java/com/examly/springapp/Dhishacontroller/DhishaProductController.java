package com.examly.springapp.Dhishacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.Dhishamodel.DhishaProduct;
import com.examly.springapp.Dhishaservice.DhishaProductService;

@RestController
public class DhishaProductController {
    @Autowired
    DhishaProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<DhishaProduct> postMethod(@RequestBody DhishaProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<DhishaProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<DhishaProduct>> dndcjk() {
        List<DhishaProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<DhishaProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<DhishaProduct>> getbyid(@PathVariable String productCategory) {
        List<DhishaProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DhishaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<DhishaProduct>> getbdyid(@PathVariable String priceCategory) {
        List<DhishaProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DhishaProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
