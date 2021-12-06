package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.controller.dto.UserDto;
import com.demo.entity.User;
import com.demo.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String addUser(@RequestBody UserDto userDto) {
		
		User user=new ObjectMapper().convertValue(userDto, User.class);
		
		Long userid=userRepository.save(user).getUserid();
		
		return "User Saved: "+userid;
		
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public  Optional<User> findById(Long id){
		return userRepository.findById(id);
	}
	

}
