package com.SpEEdysm1des.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.models.OrderModel;

//@Primary
@Service
public class OrdersBusinessService2 implements OrdersBusinessServiceInterface{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("OrdersBusinessService is working");
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0l, "AAA", "Making phones", 1805.0f, 1));
		orders.add(new OrderModel(1l, "AAB", "Installation LEDs", 120.0f, 2));
		orders.add(new OrderModel(2l, "AAC", "Gaming", 430.0f, 3));
		orders.add(new OrderModel(3l, "AAD", "Racing", 710.0f, 4));
		orders.add(new OrderModel(4l, "AAE", "Boxing", 500.0f, 5));
		return orders;
	}
	

}
