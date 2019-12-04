package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.beans.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public List<Product> getAllProduct(){
		String sql="select * from product1234";
		List<Product> plist=jdbcTemplate.query(sql, new RowMapper<Product>(){
				public Product mapRow(ResultSet rs,int nrows) throws SQLException {
					Product p=new Product();
					p.setId(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setQty(rs.getInt(3));
					p.setExpDate(rs.getDate(4));
					return p;
				}});
	return plist;	
	}



	public int addProduct(Product p) {
		String sql="insert into product1234 values(?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getQty(),p.getExpDate()});
		
		
	}



	public Product getProductById(int id) {
		String sql="select * from product1234 where id=?";
		//jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Product>());
		return (Product)jdbcTemplate.queryForObject(sql,new Object[] {id},new RowMapper<Product>(){
			public Product mapRow(ResultSet rs,int nrows) throws SQLException {
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setExpDate(rs.getDate(4));
				return p;
			}});
		
		
	}


	
	public int updateProduct(Product p) {
		String sql="update product1234 set name=?,qty=? where id=?";
		
		return jdbcTemplate.update(sql,new Object[] {p.getName(),p.getQty(),p.getId()});
	}


	
	public int deleteProductById(int id) {
		String sql="delete from  product1234 where id=?";
		return jdbcTemplate.update(sql,new Object[] {id});
	}
	
}
