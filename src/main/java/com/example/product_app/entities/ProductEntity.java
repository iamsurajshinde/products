package com.example.product_app.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int productId;
    public String productName;
    public String productDescription;
    public int productPrice;
    public int productQuantity;
}
