package com.sgblue.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgblue.course.entities.User;

@RestController
@RequestMapping(value= "/users")

public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Eduardo", "eduaugusto10@gmail.com", "11999113863", "12345");
		
		return ResponseEntity.ok().body(u);
	}
}
