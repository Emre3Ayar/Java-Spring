package com.SpEEdysm1des.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpEEdysm1des.models.UserModel;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/users")
public class UserRestController {
	@Autowired
	UsersBusinessServiceInterface service;
	@PostMapping("/")
	public long addUser(@RequestBody UserModel model)
	{	
		return service.addUser(model);
	}
	@GetMapping("/")
	public List<UserModel> showAllUsers()
	{	
		List<UserModel> users = service.getUsers();
		return users;
	}
}
