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
		batteries.add(new BatteryModel(0, "BL-5C", "BL-5C.jpg", "BL 5C Replacement battery for Nokia devices, with a capacity of 1020mAh."));
		batteries.add(new BatteryModel(1, "BA900", "BA900.jpg", "The Sony BA-900 battery gives your Sony Xperia device a capacity of 1700 milliampere hours. This expression of the current of your battery is more often referred to as mAh. Is your mAh high? Then it will take a long time before your battery is empty."));
		batteries.add(new BatteryModel(2, "B500BE", "B500BE.jpg", "This battery has 4 contact points and is also known by the following codes: EBB500BE EB B500 BE and also equipped with an NFC chip to communicate with other devices."));
		batteries.add(new BatteryModel(3, "JS1", "JS1.jpg", "Original Blackberry J-S1 battery for BlackBerry Curve 9320. It's always good to have a full spare battery on hand. Whether for long flights, meetings or even power outages, the BlackBerry battery has been specially designed for your BlackBerry smartphone and gives you the energy to continue communicating."));
		batteries.add(new BatteryModel(4, "EB-BJ710CBE", "EB-BJ710CBE.jpg", "An original Samsung EB-BJ710CBE battery for the Samsung Galaxy J7 2016. With a capacity of 3300mAh, this is the ideal battery to give your phone a second life."));
		batteries.add(new BatteryModel(5, "AB553446BU", "AB553446BU.jpg", "Nowadays we use our mobile phones for everything. Photographing, texting, calling, navigating... We can't get enough of it. Unfortunately, our battery often has had enough. With the replaceable battery for the Beat S, Champ, GT-C3300K and others, gaming, chatting and surfing the internet is no longer a problem."));
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
