package com.SpEEdysm1des.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.data.ConsolesDataAccessInterface;
import com.SpEEdysm1des.models.ConsoleModel;

//@Service
public class ConsolesBusinessService implements ConsolesBusinessServiceInterface{

	@Autowired
	ConsolesDataAccessInterface consolesDAO;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("initialized ConsolesBusinessService");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy ConsolesBusinessService");
	}
	@Override
	public ConsoleModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ConsoleModel> getConsoles() {
		// TODO Auto-generated method stub
		return consolesDAO.getConsoles();
	}
	@Override
	public List<ConsoleModel> searchConsoles(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long addOne(ConsoleModel newOrder) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ConsoleModel updateOne(long idToUpdate, ConsoleModel updateOrder) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ConsoleModel> CarouselConsoles() {
		// TODO Auto-generated method stub
		return consolesDAO.CarouselConsoles();
	}

}
