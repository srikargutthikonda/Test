package com.posidex.service;

import java.util.List;

import com.posidex.command.ProductForm;
import com.posidex.domain.Product;

public interface ProductService {
	List<Product> listAll();

	Product getById(Long id);

	Product saveOrUpdate(Product product);

	void delete(Long id);

	Product saveOrUpdateProductForm(ProductForm productForm);

}
