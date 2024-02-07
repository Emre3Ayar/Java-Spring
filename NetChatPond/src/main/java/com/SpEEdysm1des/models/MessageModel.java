package com.SpEEdysm1des.models;

public class MessageModel {
	long id = 0L;
	long userId = 0L;
	String messageContent = "";
	@Override
	public String toString() {
		return "MessageModel [id=" + id + ", userId=" + userId + ", messageContent=" + messageContent + "]";
	}
	public MessageModel(long id, long userId, String messageContent) {
		super();
		this.id = id;
		this.userId = userId;
		this.messageContent = messageContent;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
	
	
}
