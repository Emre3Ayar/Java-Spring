package com.SpEEdysm1des.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.SpEEdysm1des.models.MessageModel;
import com.SpEEdysm1des.models.UserModel;
import com.SpEEdysm1des.models.UsersMapper;
import com.SpEEdysm1des.services.MessagesBusinessServiceInterface;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

//MySQL database
@Primary
@Repository
public class UsersDataService implements UserDataAccessInterface {
	@Autowired
	MessagesBusinessServiceInterface service;
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<UserModel> getUsers() {
		// TODO Auto-generated method stub
		List<UserModel> results = jdbcTemplate.query("SELECT * FROM users", new UsersMapper());
		return results;
	}

	@Override
	public List<UserModel> searchUser(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkToken(UserModel model) {
		// TODO Auto-generated method stub
		var token = model.getUserToken();
		List<UserModel> results = jdbcTemplate.query("SELECT USERTOKEN FROM users WHERE ? = USERTOKEN", new UsersMapper(), token);
		if (results.get(0) != null) {
			return true;
		}
		return false;
	}


	@Override
	public long addUser(UserModel newUser) {
		// TODO Auto-generated method stub
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("users").usingGeneratedKeyColumns("ID");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("USERNAME", newUser.getUserName());
		parameters.put("USERTOKEN", newUser.getUserToken());
		parameters.put("USERRED", newUser.getUserRed());
		parameters.put("USERBLUE", newUser.getUserBlue());
		parameters.put("USERGREEN", newUser.getUserGreen());
		parameters.put("USERMESSAGES", newUser.getMessageId());
		Number results = simpleJdbcInsert.executeAndReturnKey(parameters);
		return results.longValue();
	}
	
}
