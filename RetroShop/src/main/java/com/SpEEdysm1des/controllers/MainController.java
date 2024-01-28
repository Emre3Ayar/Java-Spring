package com.SpEEdysm1des.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpEEdysm1des.models.ConsoleModel;
import com.SpEEdysm1des.services.ConsolesBusinessServiceInterface;

@Controller
public class MainController {
	ConsolesBusinessServiceInterface service;
	@Autowired
	public MainController(ConsolesBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showAllOrders(Model model)
	{	
		List<ConsoleModel> consoles = service.CarouselConsoles();
		model.addAttribute("consoles", consoles);
		return "index.html";
	}
}
