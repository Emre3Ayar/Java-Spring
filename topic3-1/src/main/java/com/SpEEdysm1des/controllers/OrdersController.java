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
	
	
	OrdersBusinessServiceInterface service;
	@Autowired
	public OrdersController(OrdersBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showAllOrders(Model model)
	{	
		List<OrderModel> orders = service.getOrders();
		
		model.addAttribute("title", "Here is what I want to tdo");
		model.addAttribute("orders", orders);
		return "orders.html";
	}
}
