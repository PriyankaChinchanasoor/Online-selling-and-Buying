package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long productid;
    private String name;
    private String type;
    private long unitPrice;
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Product(String name, String type, long unitPrice) {
		super();
		this.name = name;
		this.type = type;
		this.unitPrice = unitPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    

}
