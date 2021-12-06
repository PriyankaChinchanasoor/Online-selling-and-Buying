package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.controller.dto.ShoppingCartDto;
import com.demo.entity.Product;
import com.demo.entity.ShoppingCart;
import com.demo.entity.User;
import com.demo.repository.ProductRepository;
import com.demo.repository.ShoppingCartRepository;
import com.demo.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class ShoppingCartService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public ProductRepository productRepository;
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	public String addToCart(@RequestBody ShoppingCartDto shoppingCartDto) {
		
		Long uid=shoppingCartDto.getUserid();
		
		Long pid=shoppingCartDto.getProductid();
		
		Long quan=shoppingCartDto.getQuantity();
		
		User user=userRepository.findById(uid).orElse(null);
		
		Product product=productRepository.findById(pid).orElse(null);
		
		Long price=(product.getUnitPrice())*(quan);
		
		//ShoppingCart cart=new ObjectMapper().convertValue(shoppingCartDto, ShoppingCart.class);
		
		ShoppingCart cart=new ShoppingCart(quan, price, user, product);
		
		Long cartid=shoppingCartRepository.save(cart).getCartid();
		
		return "Shopping cart added: "+cartid;
		
	}
	
	public List<ShoppingCart> findAll(){
		return shoppingCartRepository.findAll();
	}
	
	public  Optional<ShoppingCart> findById(Long id){
		return shoppingCartRepository.findById(id);
	}

}
