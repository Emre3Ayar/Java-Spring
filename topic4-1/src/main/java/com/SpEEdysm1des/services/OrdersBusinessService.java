package com.SpEEdysm1des.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.data.OrdersDataAccessInterface;
import com.SpEEdysm1des.models.OrderModel;

//@Service : needed if SpringConfig doesn't exist
public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	@Autowired
	OrdersDataAccessInterface ordersDAO;
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("OrdersBusinessService is working");
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		return ordersDAO.getOrders();
	}
	//on initialized
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("initialized OrdersBusinessService");
	}
	//on destroyed
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy OrdersBusinessService");
	}

	@Override
	public OrderModel getById(long id) {
		// TODO Auto-generated method stub
		return ordersDAO.getById(id);
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {
		// TODO Auto-generated method stub
		return ordersDAO.searchOrders(searchTerm);
	}

	@Override
	public long addOne(OrderModel newOrder) {
		// TODO Auto-generated method stub
		return ordersDAO.addOne(newOrder);
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return ordersDAO.deleteOne(id);
	}

	@Override
	public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		return ordersDAO.updateOne(idToUpdate, updateOrder);
	}
	

}
