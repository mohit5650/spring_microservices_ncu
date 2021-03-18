package com.brainmentors.apps.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brainmentors.apps.models.Product;
import com.brainmentors.apps.services.ProductService;

@CrossOrigin
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/products")
	public Map<String, List<Product>> getAllProducts(){
		Map<String, List<Product>> map = new HashMap<>();
		List<Product> products = productService.getAllProducts();
		map.put("products", products);
		return map;
		
	}
	
	@PostMapping(path = "/addproduct")
	public Map<String, String> addProduct(@RequestBody Product product){
			String message = productService.addProduct(product);
			Map<String, String> map = new HashMap<>();
			map.put("message", message);
			return map;
	}

}
