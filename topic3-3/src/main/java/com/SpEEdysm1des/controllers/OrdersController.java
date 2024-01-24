package com.SpEEdysm1des.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpEEdysm1des.models.OrderModel;
import com.SpEEdysm1des.services.OrdersBusinessService;
import com.SpEEdysm1des.services.OrdersBusinessService2;
import com.SpEEdysm1des.services.OrdersBusinessServiceInterface;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	//Dependency injection (@Autowired) doesn't make another instance of OrderBusinessServiceInterface
	OrdersBusinessServiceInterface service;
	@Autowired
	public OrdersController(OrdersBusinessServiceInterface service) {
		super();
		this.service = service;
	}
	//URL link
	@GetMapping("/")
	public String showAllOrders(Model model)
	{	
		List<OrderModel> orders = service.getOrders();
		
		//values to send to page (linked to html code)
		model.addAttribute("title", "Here is what I want to tdo");
		model.addAttribute("orders", orders);
		//Return to html page
		return "orders.html";
	}
}
