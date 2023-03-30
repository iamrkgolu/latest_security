package com.security.service;

import java.util.List;

import com.security.model.Product;

public interface ProductService {

	List<Product> findAll();

	Product createProducts(Product product);

	Product findById(int id);

}
