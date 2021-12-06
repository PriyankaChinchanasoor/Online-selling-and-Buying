package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.controller.dto.ProductDto;
import com.demo.controller.dto.ShoppingCartDto;
import com.demo.controller.dto.UserDto;
import com.demo.entity.Product;
import com.demo.entity.ShoppingCart;
import com.demo.entity.User;
import com.demo.repository.ProductRepository;
import com.demo.repository.ShoppingCartRepository;
import com.demo.repository.UserRepository;
import com.demo.service.ProductService;
import com.demo.service.ShoppingCartService;
import com.demo.service.UserService;

@RestController
@RequestMapping("/shop")
public class ShoppingCartController {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public ProductRepository productRepository;
	
	@Autowired
	public ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody UserDto userDto) {
		return userService.addUser(userDto);
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody ProductDto productDto) {
		return productService.addProduct(productDto);
	}
	
	@PostMapping("/addtocart")
	public  String addToCart(@RequestBody ShoppingCartDto shoppingCartDto) {
		return shoppingCartService.addToCart(shoppingCartDto);
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser(){
		return ResponseEntity.ok(userService.findAll());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable long id){
		return ResponseEntity.ok(userService.findById(id).orElse(null));
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok(productService.findAll());
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable long id){
		return ResponseEntity.ok(productService.findById(id).orElse(null));
	}
	
	@GetMapping("/cart")
	public ResponseEntity<List<ShoppingCart>> getAllCart(){
		return ResponseEntity.ok(shoppingCartService.findAll());
	}
	
	@GetMapping("/cart/{id}")
	public ResponseEntity<ShoppingCart> getCart(@PathVariable long id){
		return ResponseEntity.ok(shoppingCartService.findById(id).orElse(null));
	}
	
	

}
