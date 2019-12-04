package com.training.dao;

import java.util.List;

import com.training.beans.Product;

public interface ProductDao {
	List<Product> getAllProduct();

	int addProduct(Product p);

	Product getProductById(int id);

	int updateProduct(Product p);

	int deleteProductById(int id);
}
