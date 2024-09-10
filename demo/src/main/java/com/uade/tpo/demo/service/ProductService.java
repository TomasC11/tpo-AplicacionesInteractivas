package com.uade.tpo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uade.tpo.demo.entity.Product;
import com.uade.tpo.demo.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductConStock() 
 {
        return productRepository.findByStockGreaterThan(0);
    }
}
