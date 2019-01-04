package com.posidex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.posidex.domain.Product;

@Component
public interface ProductRepository extends CrudRepository<Product,Long>{

}
