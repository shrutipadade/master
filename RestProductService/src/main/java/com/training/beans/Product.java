package com.training.beans;

import java.util.Date;

public class Product {
	private int id;
	private String name;
	private int qty;
	private Date expDate;
	public Product(int id, String name, int qty, Date expDate) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.expDate = expDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", expDate=" + expDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
}
