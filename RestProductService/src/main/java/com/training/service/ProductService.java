package com.training.service;

import java.text.ParseException;
import java.util.List;

import com.training.beans.Product;

public interface ProductService {
	

	List<Product> getAllProduct();

	int addProduct(Product p) throws ParseException;

	Product getById(int id);

	int updateProduct(Product p);

	int deleteProductById(int id);
}
