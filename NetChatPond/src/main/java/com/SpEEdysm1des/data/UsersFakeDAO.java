package com.SpEEdysm1des.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.SpEEdysm1des.models.UserModel;
//import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class UsersFakeDAO implements UserDataAccessInterface{
	//MessageDataAccessInterface service;
	//@Autowired
	//public UsersFakeDAO(MessageDataAccessInterface service) {
	//	super();
	//	this.service = service;
	//}
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	List<UserModel> users = new ArrayList<UserModel>();
	long[] intArray = new long[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	

	public UsersFakeDAO() {
		users.add(new UserModel(0L,"Emre",123,0.0 ,0.0, 0.0, 0L));
		users.add(new UserModel(1L,"Emrea",321,0.0 ,0.0, 0.0, 0L));
	}

	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public List<UserModel> searchUser(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addUser(UserModel newUser) {
		// TODO Auto-generated method stub
//		int i = 0;
//		while(i < users.size()) {
//			if (Objects.equals(users.get(i).getUserName(), newUser.getUserName())) {
//				System.out.println("user not added");
//				return 0;
//			}
//			i++;
//		}
//		if (!(i < users.size())) {
//			Random rand = new Random();
//			int rand_int = rand.nextInt(1000);
//			newUser.setUserToken(rand_int);
//			users.add(newUser);
//			return 1;
//		}
//		System.out.println("user not added");
		//jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS beers(name VARCHAR(100))");
		
		//Insert a record:
		//jdbcTemplate.execute("INSERT INTO beers VALUES ('Stella')");

		//Read records:
		//List<UserModel> beers = jdbcTemplate.query("SELECT * FROM beers",(resultSet, rowNum) -> new UserModel(0L,"Bob",123,0.0 ,0.0, 0.0, intArray));
		
		//Print read records:
		//beers.forEach(System.out::println);
		return 0;
	}

	@Override
	public boolean checkToken(UserModel model) {
		// TODO Auto-generated method stub
		for (int i = 0; i < users.size();i++) {
			if (Objects.equals(users.get(i).getUserName(), model.getUserName())) {
				if (model.getUserToken() == users.get(i).getUserToken()) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean SendMessage(UserModel model, String message) {
		// TODO Auto-generated method stub
		if(checkToken(model)) {
			//MessageModel e = service.createMessage(message);
			//model.addMessageId(e.getMessageId());
			return true;
		}
		return false;
	}
}
