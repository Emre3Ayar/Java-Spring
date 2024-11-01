package com.SpEEdysm1des.model;

public class VideoModel {
	long id = 0L;
	String userName = "";
	
	@Override
	public String toString() {
		return "VideoModel [id=" + id + ", userName=" + userName + "]";
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

	public VideoModel(long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	
}
