package com.posidex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posidex.command.ProductForm;
import com.posidex.converter.ProductFormToProduct;
import com.posidex.domain.Product;
import com.posidex.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductFormToProduct productFormToProduct;

	/*
	 * @Autowired public ProductServiceImpl(ProductRepository productRepository,
	 * ProductFormToProduct productFormToProduct) { this.productRepository =
	 * productRepository; this.productFormToProduct = productFormToProduct; }
	 */
	@Override
	public List<Product> listAll() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add); // fun with Java 8
		return products;
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product saveOrUpdate(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public void delete(Long id) {
		productRepository.delete(id);

	}

	@Override
	public Product saveOrUpdateProductForm(ProductForm productForm) {
		Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));
		System.out.println("Saved Product Id: " + savedProduct.getId());
		return savedProduct;
	}

}
