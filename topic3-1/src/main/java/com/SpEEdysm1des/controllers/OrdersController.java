package com.SpEEdysm1des.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpEEdysm1des.models.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@GetMapping("/")
	public String showAllOrders(Model model)
	{
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0l, "000", "Sky diving experience", 1500.0f, 1));
		orders.add(new OrderModel(1l, "001", "Cycling", 1120.0f, 2));
		orders.add(new OrderModel(2l, "002", "Swimming", 500.0f, 3));
		orders.add(new OrderModel(3l, "003", "Programming", 1760.0f, 4));
		orders.add(new OrderModel(4l, "004", "Jumping", 2500.0f, 5));
		model.addAttribute("title", "Here is what I want to tdo");
		model.addAttribute("orders", orders);
		return "orders.html";
	}
}
