package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.controller.dto.ProductDto;
import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	public String addProduct(@RequestBody ProductDto productDto) {
		
		Product product=new ObjectMapper().convertValue(productDto, Product.class);
		
		Long productid=productRepository.save(product).getProductid();
		
		return "Product added: "+productid;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Optional<Product> findById(Long id){
		return productRepository.findById(id);
	}

}
