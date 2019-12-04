package com.training.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Product;
import com.training.dao.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	public List<Product> getAllProduct(){
		return productDao.getAllProduct();
	}
	public int addProduct(Product p) throws ParseException {
		return productDao.addProduct(p);
		
	}

	public Product getById(int id) {
		return productDao.getProductById(id);
	}
	
	public int updateProduct(Product p) {
		return productDao.updateProduct(p);
		
	}
	
	public int deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}
}
