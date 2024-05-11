package com.rudra.ecommerce_ownproductservice.Repositories;

import com.rudra.ecommerce_ownproductservice.Models.Category;
import com.rudra.ecommerce_ownproductservice.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);

    Product findByIdIs(long id);

    @Override
    List<Product> findAll();

    List<Product> findAllByTitle(String title);

    List<Product> findAllByCategory(Category category);

    List<Product> findAllByCategory_Title(String title);

    List<Product> findAllByCategory_Id(long id);

    List<Product> findByTitleStartingWithAndIdGreaterThanAndCategory_IdEquals(String title, long greaterThan, long category_id);

}
