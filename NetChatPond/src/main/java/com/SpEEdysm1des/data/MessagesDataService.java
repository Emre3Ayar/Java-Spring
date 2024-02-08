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
@Repository
public class MessagesDataService implements MessageDataAccessInterface {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public long addMessage(long userId, String content) {
		// TODO Auto-generated method stub
		MessageModel r = new MessageModel(0, userId, null);
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		simpleJdbcInsert.withTableName("messages").usingGeneratedKeyColumns("ID");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("MESSAGECONTENT", content);
		parameters.put("USERID", userId);
		Number results = simpleJdbcInsert.executeAndReturnKey(parameters);
		return results.longValue();
	}
	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}
}
