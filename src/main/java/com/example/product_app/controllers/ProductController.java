package com.example.product_app.controllers;

import com.example.product_app.entities.ProductEntity;
import com.example.product_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ResponseEntity<?> getProduct() {
        try {
            List<ProductEntity> products = productService.getProducts();
            return ResponseEntity.ok(products);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal Server Error");
        }
    }

    @PostMapping
    public ResponseEntity<?> saveProducts(@RequestBody ProductEntity productEntity) {
        try {
            ProductEntity product = productService.saveProduct(productEntity);
            return ResponseEntity.ok(product);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal Server Error");
        }
    }
}
