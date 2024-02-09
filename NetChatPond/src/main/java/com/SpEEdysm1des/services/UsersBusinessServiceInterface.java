package com.SpEEdysm1des.services;

import java.util.List;

import com.SpEEdysm1des.models.UserModel;

public interface UsersBusinessServiceInterface {
	public void init();
	public void destroy();
	public boolean checkToken(UserModel model);
	
	
	public List<UserModel> getUsers();
	public List<UserModel> searchUser(String searchTerm);
	
	public long addUser(UserModel newUser);
}
