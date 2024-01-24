package com.SpEEdysm1des.services;

import java.util.List;

import com.SpEEdysm1des.models.OrderModel;

//Interface methods
public interface OrdersBusinessServiceInterface {
	public void test();
	
	public List<OrderModel> getOrders();
	
	public void init();
	
	public void destroy();
	
}
