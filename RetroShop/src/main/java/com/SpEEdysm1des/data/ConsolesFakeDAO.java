package com.SpEEdysm1des.data;

import java.util.ArrayList;
import java.util.List;

import com.SpEEdysm1des.models.ConsoleModel;

public class ConsolesFakeDAO implements ConsolesDataAccessInterface{
	
	List<ConsoleModel> consoles = new ArrayList<ConsoleModel>();
	
	public ConsolesFakeDAO() {
		consoles.add(new ConsoleModel(0, "Gameboy", "beige"));
	}

	@Override
	public ConsoleModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConsoleModel> getConsoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConsoleModel> searchConsoles(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConsoleModel> CarouselConsoles() {
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

}
