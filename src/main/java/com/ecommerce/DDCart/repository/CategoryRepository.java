package com.ecommerce.DDCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.DDCart.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
