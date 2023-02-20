package com.EcommerceSite.dao;

import com.EcommerceSite.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")                                 // name of JSON entry       // '/product-category'
@RepositoryRestResource(collectionResourceRel = "productCategory" , path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory , Long> {
}
