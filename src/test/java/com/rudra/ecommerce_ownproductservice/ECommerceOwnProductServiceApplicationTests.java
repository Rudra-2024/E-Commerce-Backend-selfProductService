package com.rudra.ecommerce_ownproductservice;

import com.rudra.ecommerce_ownproductservice.Models.Category;
import com.rudra.ecommerce_ownproductservice.Repositories.CategoryRepository;
import com.rudra.ecommerce_ownproductservice.Repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ECommerceOwnProductServiceApplicationTests {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testQueries(){
        Category category = categoryRepository.findById(1L);
        System.out.println("Fetched a category object");
        //Category category = optionalCategory.get();

        category.getProducts();
    }
}
