package com.SpEEdysm1des.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//MySQL database
public class MessagesMapper implements RowMapper<MessageModel> {
	@Override
	public MessageModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		MessageModel user = new MessageModel(rs.getLong("ID"),rs.getLong("USERID"), rs.getString("MESSAGECONTENT"));
		return user;
	}
	
}
