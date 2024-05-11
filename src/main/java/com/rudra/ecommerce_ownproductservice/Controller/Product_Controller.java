package com.rudra.ecommerce_ownproductservice.Controller;

import com.rudra.ecommerce_ownproductservice.DTOs.requestBodyDto;
import com.rudra.ecommerce_ownproductservice.Models.Product;
import com.rudra.ecommerce_ownproductservice.Services.product_service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Product_Controller {

    product_service productService;
    public Product_Controller(@Qualifier("selfService") product_service productService){
        this.productService=productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody requestBodyDto request){
        return productService.createProduct(request.getTitle(),
                request.getDescription(),
                request.getPrice(),
                request.getCategory(),
                request.getImage());
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    public void updateProduct(){
        return;
    }
}
