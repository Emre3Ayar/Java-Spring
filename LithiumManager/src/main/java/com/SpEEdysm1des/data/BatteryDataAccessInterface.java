package com.SpEEdysm1des.data;

import java.util.List;

import com.SpEEdysm1des.models.BatteryModel;

public interface BatteryDataAccessInterface {
	public BatteryModel getById(long id);
	public List<BatteryModel> getBatteries();
	public List<BatteryModel> searchBatteries(String searchTerm);
	public List<BatteryModel> CarouselConsoles();
	
	public long addOne(BatteryModel newOrder);
	public boolean deleteOne(long id);
	public BatteryModel updateOne(long idToUpdate, BatteryModel updateOrder);
}
