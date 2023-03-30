package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.model.Product;
import com.security.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product createProducts(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product findById(int id) {
		
		return productRepository.findById(id).get();
	}

}
