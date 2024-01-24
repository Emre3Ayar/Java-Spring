package com.SpEEdysm1des.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.SpEEdysm1des.models.OrderModel;

@Repository
public class OrdersFakeDAO implements OrdersDataAccessInterface {
	
	List<OrderModel> orders = new ArrayList<OrderModel>();
	public OrdersFakeDAO() {
		orders.add(new OrderModel(0l, "000", "Sky diving experience", 1500.0f, 1));
		orders.add(new OrderModel(1l, "001", "Cycling", 1120.0f, 2));
		orders.add(new OrderModel(2l, "002", "Swimming", 500.0f, 3));
		orders.add(new OrderModel(3l, "003", "Programming", 1760.0f, 4));
		orders.add(new OrderModel(4l, "004", "Jumping", 2500.0f, 5));
	}

	@Override
	public OrderModel getById(long id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getId() == id) {
				return orders.get(i);
			}
		}
		return null;
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {
		// TODO Auto-generated method stub
		//Method 1
		List<OrderModel> foundItems = new ArrayList<OrderModel>();
		for(int i=0; i < orders.size(); i++)
		{
			if(orders.get(i).getProductName().toLowerCase().contains(searchTerm.toLowerCase())) {
				foundItems.add(orders.get(i));
			}
		}
		//Method 2
//		List<OrderModel> foundItems = orders
//				.stream()
//				.filter(order -> order.getProductName().toLowerCase().contains(searchTerm.toLowerCase()))
//				.collect(Collectors.ToList());
//		
		return foundItems;
	}

	@Override
	public long addOne(OrderModel newOrder) {
		// TODO Auto-generated method stub
		boolean success = orders.add(newOrder);
		if (success) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getId() == id) {
				orders.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getId() == idToUpdate) {
				orders.set(i, updateOrder);
				return orders.get(i);
			}
		}
		return null;
	}

}
