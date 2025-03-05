package com.example.demoUser.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demoUser.Entity.User;
import com.example.demoUser.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@PostMapping
	//  we use the @RequestBody annotation in a controller method to map 
	//the HTTP request body to a Java object.
	//This is essential when working with REST APIs that send data as JSON or XML.
	/*Converts incoming JSON or XML data into a Java object.
      Uses Spring’s HttpMessageConverter to perform this conversion automatically.
      Eliminates the need for manual JSON parsing using libraries like Jackson or Gson.*/
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
		
	}
	
	@GetMapping("/{id}")
	/* @pathvariable :: Extracts values directly from the URL path.
     Maps URL segments to method parameters dynamically.
     Useful for RESTful APIs where resources have unique identifiers.*/
	public ResponseEntity<User> getUSerById(@PathVariable Long id){
		Optional<User> user =userService.getUserbyId(id);
		return user.map(ResponseEntity::ok)
				.orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User userDetails){
		
		try {
			User updatedUser=userService.updateUser(id, userDetails);
			return ResponseEntity.ok(updatedUser);
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
		
		
	}
	
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.noContent().build();
	    }

}
