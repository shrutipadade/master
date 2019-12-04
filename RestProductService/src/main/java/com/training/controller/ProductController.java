package com.training.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.training.beans.Product;
import com.training.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products",method=RequestMethod.GET,produces="application/json")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@RequestMapping(value="/products",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public List<Product> addProduct(@RequestBody Product p) throws ParseException{
		productService.addProduct(p);
		return productService.getAllProduct();
	}
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE,produces="application/json")
	public List<Product> deleteProduct(@PathVariable int id) throws ParseException{
		productService.deleteProductById(id);
		return productService.getAllProduct();
	}

	@RequestMapping(value="/products/{id}",method=RequestMethod.PUT,produces="application/json",consumes="application/json")
	public List<Product> updateProduct(@RequestBody Product p) throws ParseException{
		productService.updateProduct(p);
		return productService.getAllProduct();
	}
}
