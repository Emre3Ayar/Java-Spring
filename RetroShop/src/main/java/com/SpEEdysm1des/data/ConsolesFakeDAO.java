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

import com.SpEEdysm1des.models.ConsoleModel;

@Repository
public class ConsolesFakeDAO implements ConsolesDataAccessInterface{
	
	List<ConsoleModel> consoles = new ArrayList<ConsoleModel>();
	
	public ConsolesFakeDAO() {
		consoles.add(new ConsoleModel(0, "Gameboy", "beige", "gameboy.png"));
		consoles.add(new ConsoleModel(1, "SNES", "yellow", "snes.png"));
		consoles.add(new ConsoleModel(2, "Playstation", "red", "playstation.png"));
		consoles.add(new ConsoleModel(3, "Wii", "green", "wii.png"));
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
		List<ConsoleModel> indexList = new ArrayList<ConsoleModel>();
		for (int i = 0;i < consoles.size(); i++) {
			indexList.add(consoles.get(i));
		}
		return indexList;
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
