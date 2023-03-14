package com.EcommerceSite.dao;

import com.EcommerceSite.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "countries" , path = "countries") // expose /countries endPoint
                                                                                   // http://localhost:8080/api/countries/4
public interface CountryRepository extends JpaRepository<Country , Integer> {

}
