package com.SpEEdysm1des.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.SpEEdysm1des.data.MessageDataAccessInterface;
import com.SpEEdysm1des.data.UserDataAccessInterface;
import com.SpEEdysm1des.models.DisplayMessageModel;
import com.SpEEdysm1des.models.MessageModel;
import com.SpEEdysm1des.models.UserModel;

//@Service
@Primary
public class MessagesBusinessService implements MessagesBusinessServiceInterface{
	
	@Autowired
	MessageDataAccessInterface messagesDAO;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long addMessage(long userId, String content) {
		// TODO Auto-generated method stub
		return messagesDAO.addMessage(userId, content);
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMessageFrom(long userId) {
		// TODO Auto-generated method stub
		return messagesDAO.getMessageFrom(userId);
	}
	@Override
	public boolean SendMessage(UserModel model, String message) {
		// TODO Auto-generated method stub
		return messagesDAO.SendMessage(model, message);
	}

	@Override
	public List<DisplayMessageModel> displayMessages() {
		// TODO Auto-generated method stub
		return messagesDAO.displayMessages();
	}
	
}
