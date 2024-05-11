package com.rudra.ecommerce_ownproductservice.Repositories;

import com.rudra.ecommerce_ownproductservice.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);
    Category save(Category category);
    Category findById(long id);
}
