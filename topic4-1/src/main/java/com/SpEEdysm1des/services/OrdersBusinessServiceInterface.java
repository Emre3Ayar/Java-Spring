package com.SpEEdysm1des.services;

import java.util.List;

import com.SpEEdysm1des.models.OrderModel;

//Interface methods
public interface OrdersBusinessServiceInterface {
	public void test();
	
	public void init();
	
	public void destroy();
	
	public OrderModel getById(long id);
	public List<OrderModel> getOrders();
	public List<OrderModel> searchOrders(String searchTerm);
	public long addOne(OrderModel newOrder);
	public boolean deleteOne(long id);
	public OrderModel updateOne(long idToUpdate, OrderModel updateOrder);
	
}
