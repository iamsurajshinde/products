package com.example.product_app.services;

import com.example.product_app.entities.ProductEntity;
import com.example.product_app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductEntity> getProducts() {
        return productRepository.findAll();
    }

    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
}
