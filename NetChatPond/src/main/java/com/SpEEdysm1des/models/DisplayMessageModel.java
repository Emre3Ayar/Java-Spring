package com.SpEEdysm1des.models;

public class DisplayMessageModel {
	long id = 0L;
	String messageContent = "";
	String userName = "";
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "DisplayMessageModel [id=" + id + ", messageContent=" + messageContent + ", userName=" + userName + "]";
	}
	public DisplayMessageModel(long id, String messageContent, String userName) {
		super();
		this.id = id;
		this.messageContent = messageContent;
		this.userName = userName;
	}
	
}
