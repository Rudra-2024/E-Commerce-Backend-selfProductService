package com.rudra.ecommerce_ownproductservice.Services;

import com.rudra.ecommerce_ownproductservice.Models.Product;

import java.util.List;

public interface product_service {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(String title,
                          String description,
                          double price,
                          String category,
                          String image);
}
