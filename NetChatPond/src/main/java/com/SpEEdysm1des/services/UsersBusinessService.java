package com.SpEEdysm1des.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.data.UserDataAccessInterface;
import com.SpEEdysm1des.models.UserModel;

//@Service
@Primary
public class UsersBusinessService implements UsersBusinessServiceInterface{
	
	@Autowired
	UserDataAccessInterface usersDAO;
	@Override
	public void init() {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		return usersDAO.getUsers();
	}

	@Override
	public List<UserModel> searchUser(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addUser(UserModel newUser) {
		// TODO Auto-generated method stub
		return usersDAO.addUser(newUser);
	}

	@Override
	public boolean checkToken(UserModel model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyUser(UserModel loginUser) {
		// TODO Auto-generated method stub
		return usersDAO.verifyUser(loginUser);
	}


	
}
