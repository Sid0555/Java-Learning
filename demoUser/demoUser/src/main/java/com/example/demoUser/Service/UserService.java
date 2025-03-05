package com.example.demoUser.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoUser.Entity.User;
import com.example.demoUser.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserbyId(Long Id){
		return userRepository.findById(Id);
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(Long id,User userDetails) {
		return userRepository.findById(id)
				.map(user ->{user.setName(userDetails.getName());user.setEmail(userDetails.getEmail());
		return userRepository.save(user);}).orElseThrow(()-> new RuntimeException("USer not found"));
		
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
