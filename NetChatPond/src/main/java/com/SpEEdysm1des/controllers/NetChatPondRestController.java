package com.SpEEdysm1des.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpEEdysm1des.models.UserModel;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/users")
public class NetChatPondRestController {
	UsersBusinessServiceInterface service;
	@Autowired
	public NetChatPondRestController(UsersBusinessServiceInterface service) {
		super();
		this.service = service;
	}
	@PostMapping("/")
	public long addUser(@RequestBody UserModel model)
	{	
		return service.addUser(model);
	}
	@PostMapping("/send/{message}")
	public boolean sendMessage(@PathVariable(name="message") String message, @RequestBody UserModel model)
	{	
		return service.SendMessage(model, message);
		//return false;
	}
	@GetMapping("/")
	public List<UserModel> showAllUsers()
	{	
		List<UserModel> users = service.getUsers();
		return users;
	}
}
