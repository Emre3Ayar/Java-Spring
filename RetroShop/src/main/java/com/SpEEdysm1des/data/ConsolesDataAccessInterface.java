package com.SpEEdysm1des.data;

import java.util.List;

import com.SpEEdysm1des.models.ConsoleModel;

public interface ConsolesDataAccessInterface {
	public ConsoleModel getById(long id);
	public List<ConsoleModel> getConsoles();
	public List<ConsoleModel> searchConsoles(String searchTerm);
	public List<ConsoleModel> CarouselConsoles();
	
	public long addOne(ConsoleModel newOrder);
	public boolean deleteOne(long id);
	public ConsoleModel updateOne(long idToUpdate, ConsoleModel updateOrder);
}
