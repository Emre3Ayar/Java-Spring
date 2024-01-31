package com.SpEEdysm1des.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.data.BatteryDataAccessInterface;
import com.SpEEdysm1des.models.BatteryModel;

//@Service
public class BatteriesBusinessService implements BatteriesBusinessServiceInterface{

	@Autowired
	BatteryDataAccessInterface batteriesDAO;
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
	public BatteryModel getById(long id) {
		// TODO Auto-generated method stub
		return batteriesDAO.getById(id);
	}
	@Override
	public List<BatteryModel> getBatteries() {
		// TODO Auto-generated method stub
		return batteriesDAO.getBatteries();
	}
	@Override
	public List<BatteryModel> searchBatteries(String searchTerm) {
		// TODO Auto-generated method stub
		return batteriesDAO.searchBatteries(searchTerm);
	}
	@Override
	public long addOne(BatteryModel newOrder) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BatteryModel updateOne(long idToUpdate, BatteryModel updateOrder) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<BatteryModel> CarouselConsoles() {
		// TODO Auto-generated method stub
		return batteriesDAO.CarouselConsoles();
	}

}
