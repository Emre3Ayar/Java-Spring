package com.SpEEdysm1des.models;

import java.util.Arrays;

public class UserModel {
	long id = 0L;
	String userName = "";
	int userToken = 0;
	double userRed = 0.0;
	double userBlue = 0.0;
	double userGreen = 0.0;
	long messageId = 0L;
	
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", userName=" + userName + ", userToken=" + userToken + ", userRed=" + userRed
				+ ", userBlue=" + userBlue + ", userGreen=" + userGreen + ", messageId=" + messageId + "]";
	}
	public UserModel(long id, String userName, int userToken, double userRed, double userBlue, double userGreen,
			long messageId) {
		super();
		this.id = id;
		this.userName = userName;
		this.userToken = userToken;
		this.userRed = userRed;
		this.userBlue = userBlue;
		this.userGreen = userGreen;
		this.messageId = messageId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserToken() {
		return userToken;
	}
	public void setUserToken(int userToken) {
		this.userToken = userToken;
	}
	public double getUserRed() {
		return userRed;
	}
	public void setUserRed(double userRed) {
		this.userRed = userRed;
	}
	public double getUserBlue() {
		return userBlue;
	}
	public void setUserBlue(double userBlue) {
		this.userBlue = userBlue;
	}
	public double getUserGreen() {
		return userGreen;
	}
	public void setUserGreen(double userGreen) {
		this.userGreen = userGreen;
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
}
