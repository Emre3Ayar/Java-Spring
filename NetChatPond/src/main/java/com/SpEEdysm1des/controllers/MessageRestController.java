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

import com.SpEEdysm1des.models.DisplayMessageModel;
import com.SpEEdysm1des.models.MessageModel;
import com.SpEEdysm1des.models.UserModel;
import com.SpEEdysm1des.services.MessagesBusinessServiceInterface;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class MessageRestController {
	@Autowired
	MessagesBusinessServiceInterface service2;
//	@Autowired
//	public NetChatPondRestController(UsersBusinessServiceInterface service) {
//		super();
//		this.service = service;
//	}

	@PostMapping("/send/{message}")
	public boolean sendMessage(@PathVariable(name="message") String message, @RequestBody UserModel model)
	{	
		return service2.SendMessage(model, message);
		//return false;
	}

	@PostMapping("/getMessages/{id}")
	public String getMessages(@PathVariable(name="id") long id)
	{	
		return service2.getMessageFrom(id);
	}
	
	@GetMapping("/displayMessage")
	public List<DisplayMessageModel> showAllUsers()
	{	
		List<DisplayMessageModel> messages = service2.displayMessages();
		System.out.println(messages);
		return messages;
	}
}
