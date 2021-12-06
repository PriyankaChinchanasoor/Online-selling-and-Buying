package com.demo.entity;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ShoppingCart {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long cartid;
	@Column
	private long quantity;
	public long price;
	@OneToOne(targetEntity = User.class)
	private User user;
	@OneToOne(targetEntity = Product.class)
	private Product product;
	public long getCartid() {
		return cartid;
	}
	public void setCartid(long cartid) {
		this.cartid = cartid;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ShoppingCart(long quantity, long price, User user, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.user = user;
		this.product = product;
	}
	

}
