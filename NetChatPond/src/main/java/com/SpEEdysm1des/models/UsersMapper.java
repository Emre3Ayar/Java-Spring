package com.SpEEdysm1des.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//MySQL database
public class UsersMapper implements RowMapper<UserModel> {
	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserModel user = new UserModel(rs.getLong("ID"), rs.getString("USERNAME"), rs.getInt("USERTOKEN"), rs.getDouble("USERRED"), rs.getDouble("USERBLUE"), rs.getDouble("USERGREEN"), rs.getLong("USERMESSAGES"));
		return user;
	}
	
}
