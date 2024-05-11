package com.rudra.ecommerce_ownproductservice.Services;

import com.rudra.ecommerce_ownproductservice.Models.Category;
import com.rudra.ecommerce_ownproductservice.Models.Product;
import com.rudra.ecommerce_ownproductservice.Repositories.CategoryRepository;
import com.rudra.ecommerce_ownproductservice.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfService")
public class Self_productService implements product_service{
    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;
    public Self_productService(CategoryRepository categoryRepository, ProductRepository productRepository){
        this.categoryRepository=categoryRepository;
        this.productRepository=productRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return productRepository.findByIdIs(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(String title,
                                 String description,
                                 double price,
                                 String category,
                                 String image) {
        Product p=new Product();
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        p.setImageURL(image);

        Category categoryFromDatabase;
        categoryFromDatabase = categoryRepository.findByTitle(category);
        if(categoryFromDatabase == null){
            Category category1 = new Category();
            category1.setTitle(category);
            categoryFromDatabase = category1;
        }
        p.setCategory(categoryFromDatabase);

        Product saveProduct = productRepository.save(p);
        return saveProduct;
    }
}
