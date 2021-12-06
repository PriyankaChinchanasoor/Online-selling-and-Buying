package com.demo.controller.dto;

public class ProductDto {
	
    private String name;
    private String type;
    private long unitPrice;
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
	public ProductDto(String name, String type, long unitPrice) {
		super();
		this.name = name;
		this.type = type;
		this.unitPrice = unitPrice;
	}
	
    
    

}
