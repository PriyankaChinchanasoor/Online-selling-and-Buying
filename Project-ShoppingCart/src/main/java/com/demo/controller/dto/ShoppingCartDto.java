package com.demo.controller.dto;

public class ShoppingCartDto {
	
	private long quantity;
	private long userid;
	private long productid;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public ShoppingCartDto(long userid, long productid, long quantity) {
		super();
		this.userid = userid;
		this.productid = productid;
		this.quantity = quantity;
	}
	
	

}
