package com.SpEEdysm1des.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpEEdysm1des.models.OrderModel;
import com.SpEEdysm1des.services.OrdersBusinessService;
import com.SpEEdysm1des.services.OrdersBusinessService2;
import com.SpEEdysm1des.services.OrdersBusinessServiceInterface;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {
	
	//Dependency injection (@Autowired) doesn't make another instance of OrderBusinessServiceInterface
	OrdersBusinessServiceInterface service;
	@Autowired
	public OrdersRestController(OrdersBusinessServiceInterface service) {
		super();
		this.service = service;
	}
	//URL link
	@GetMapping("/")
	public List<OrderModel> showAllOrders()
	{	
		List<OrderModel> orders = service.getOrders();
		return orders;
	}
}
