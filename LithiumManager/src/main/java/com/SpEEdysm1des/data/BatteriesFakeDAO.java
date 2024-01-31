package com.SpEEdysm1des.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.SpEEdysm1des.models.BatteryModel;

@Repository
public class BatteriesFakeDAO implements BatteryDataAccessInterface{
	
	List<BatteryModel> batteries = new ArrayList<BatteryModel>();
	
	public BatteriesFakeDAO() {
		batteries.add(new BatteryModel(0, "BL-5C", "gameboy.png"));
		batteries.add(new BatteryModel(1, "BA900", "snes.png"));
		batteries.add(new BatteryModel(2, "B500BE", "playstation.png"));
		batteries.add(new BatteryModel(3, "JS1", "gameboy.png"));
		batteries.add(new BatteryModel(4, "EB-BJ710CBE", "snes.png"));
		batteries.add(new BatteryModel(5, "AB553446BU", "playstation.png"));
	}

	@Override
	public BatteryModel getById(long id) {
		// TODO Auto-generated method stub
		int i = (int) id;
		return batteries.get(i);
	}

	@Override
	public List<BatteryModel> getBatteries() {
		// TODO Auto-generated method stub
		return batteries;
	}

	@Override
	public List<BatteryModel> searchBatteries(String searchTerm) {
		// TODO Auto-generated method stub
		List<BatteryModel> foundItems = new ArrayList<BatteryModel>();
		for(int i=0; i < batteries.size(); i++)
		{
			if(batteries.get(i).getbatteryCode().toLowerCase().contains(searchTerm.toLowerCase())) {
				foundItems.add(batteries.get(i));
			}
		}
		return foundItems;
	}

	@Override
	public List<BatteryModel> CarouselConsoles() {
		// TODO Auto-generated method stub
		List<BatteryModel> indexList = new ArrayList<BatteryModel>();
		for (int i = 0;i < 4; i++) {
			indexList.add(batteries.get(i));
		}
		return indexList;
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

}
