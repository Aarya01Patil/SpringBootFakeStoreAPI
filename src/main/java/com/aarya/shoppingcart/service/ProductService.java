package com.aarya.shoppingcart.service;

import org.springframework.stereotype.Service;

import com.aarya.shoppingcart.entity.Product;
import com.aarya.shoppingcart.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }
}
