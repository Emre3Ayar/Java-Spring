package com.SpEEdysm1des.data;

public interface MessageDataAccessInterface {
	public long addMessage(long userId, String content);
	public boolean test();
	public String getMessageFrom(long userId);
}
