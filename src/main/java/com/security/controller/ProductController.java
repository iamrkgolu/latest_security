package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Product;
import com.security.model.UserInfo;
import com.security.service.ProductService;
import com.security.service.UserInfoService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@GetMapping("/all")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Product> getAllProducts(){
		return productService.findAll();
	}
	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Product getAllProducts(@PathVariable int id){
		return productService.findById(id);
	}
	@PostMapping("/create")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Product createProducts(@RequestBody Product product){
		return productService.createProducts(product);
	}
	
	

}
