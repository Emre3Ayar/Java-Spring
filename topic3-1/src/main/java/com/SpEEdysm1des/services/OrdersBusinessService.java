package com.SpEEdysm1des.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpEEdysm1des.models.OrderModel;

@Service
public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("OrdersBusinessService is working");
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0l, "000", "Sky diving experience", 1500.0f, 1));
		orders.add(new OrderModel(1l, "001", "Cycling", 1120.0f, 2));
		orders.add(new OrderModel(2l, "002", "Swimming", 500.0f, 3));
		orders.add(new OrderModel(3l, "003", "Programming", 1760.0f, 4));
		orders.add(new OrderModel(4l, "004", "Jumping", 2500.0f, 5));
		return orders;
	}
	

}
