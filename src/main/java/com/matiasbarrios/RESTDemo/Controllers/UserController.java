package com.matiasbarrios.RESTDemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matiasbarrios.RESTDemo.Interfaces.IUserProvider;
import com.matiasbarrios.RESTDemo.Models.User;

@RestController
public class UserController {
	
	@Autowired
	private IUserProvider _userProvider;

	
	@PostMapping("/user")
	void CreateUser(@RequestBody User u) {
		_userProvider.createUser(u);
	}
	
	@GetMapping("/user")
	List<User> GetUsers() {
		return _userProvider.getUsers();
	}
}
