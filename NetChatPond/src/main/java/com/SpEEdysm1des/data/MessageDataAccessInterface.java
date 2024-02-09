package com.SpEEdysm1des.data;

import java.util.List;

import com.SpEEdysm1des.models.DisplayMessageModel;
import com.SpEEdysm1des.models.MessageModel;
import com.SpEEdysm1des.models.UserModel;

public interface MessageDataAccessInterface {
	public long addMessage(long userId, String content);
	public boolean test();
	public String getMessageFrom(long userId);
	public boolean SendMessage(UserModel model, String message);
	public List<DisplayMessageModel> displayMessages();
}
