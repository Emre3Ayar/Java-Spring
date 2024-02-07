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

//MySQL database
@Primary
@Repository
public class UsersDataService implements UserDataAccessInterface {
	
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
	public boolean SendMessage(UserModel model, String message) {
		// TODO Auto-generated method stub
		List<UserModel> results = jdbcTemplate.query("SELECT * FROM users", new UsersMapper());
		for (int i = 0; i < results.size();i++) {
			if (Objects.equals(results.get(i).getUserName(), model.getUserName())) {
				if (model.getUserToken() == results.get(i).getUserToken()) {
					//results.get(i)
					//MessageModel m = new MessageModel(0, 0, message);
					//SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
					//simpleJdbcInsert.withTableName("MESSAGES").usingGeneratedKeyColumns("ID");
					//Map<String, Object> parameters = new HashMap<String, Object>();
					//parameters.put(message, m.)
					//List<MessageModel> r = jdbcTemplate.query("INSERT INTO messages (USERID, MESSAGECONTENT) VALUES (?,?)");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public long addUser(UserModel newUser) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}