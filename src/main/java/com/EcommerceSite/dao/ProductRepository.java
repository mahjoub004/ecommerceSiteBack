package com.EcommerceSite.dao;

import com.EcommerceSite.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product , Long> {

    // SELECT * FROM product where category_id = ?

    // http://localhost:8080/api/products/search/findCategoryById?id=2

    //http://localhost:8080/api/product-category/2/products
    Page<Product> findCategoryById(@Param("id") Long id , Pageable pageable);


    //http://localhost:8080/api/products/search/findByNameContaining?name=artichaut

    // SELECT * FROM Product p WHERE p.name LIKE CONCAT ('%', :name , '%')

     Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
