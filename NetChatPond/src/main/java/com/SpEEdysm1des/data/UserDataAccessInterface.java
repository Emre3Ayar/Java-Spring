package com.SpEEdysm1des.data;

import java.util.List;

import com.SpEEdysm1des.models.UserModel;

public interface UserDataAccessInterface {
	public List<UserModel> getUsers();
	public List<UserModel> searchUser(String searchTerm);
	public boolean checkToken(UserModel model);
	public boolean SendMessage(UserModel model, String message);
	
	public long addUser(UserModel newUser);
}
