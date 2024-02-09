package com.SpEEdysm1des.data;

import java.util.ArrayList;
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

import com.SpEEdysm1des.models.DisplayMessageModel;
import com.SpEEdysm1des.models.MessageModel;
import com.SpEEdysm1des.models.UserModel;
import com.SpEEdysm1des.models.UsersMapper;
import com.SpEEdysm1des.models.MessagesMapper;

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
	@Override
	public String getMessageFrom(long userId) {
		// TODO Auto-generated method stub
		//var token = model.getUserToken();
		String full = "";
		List<MessageModel> results = jdbcTemplate.query("SELECT * FROM messages WHERE ? = USERID", new MessagesMapper(), userId);
		if (results.size() != 0) {
			for (MessageModel messageModel : results) {
				full += messageModel.getMessageContent();
				full += "|";
			}
			return full;
		}
		else
		{
			return "nothing";
		}
	}
	@Override
	public boolean SendMessage(UserModel model, String message) {
		// TODO Auto-generated method stub
		List<UserModel> results = jdbcTemplate.query("SELECT * FROM users", new UsersMapper());
		for (int i = 0; i < results.size();i++) {
			if (Objects.equals(results.get(i).getUserName(), model.getUserName())) {
				if (model.getUserToken() == results.get(i).getUserToken()) {
//					//-results.get(i)
//					//-MessageModel m = new MessageModel(0, 0, message);
//					//-SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
//					//-simpleJdbcInsert.withTableName("MESSAGES").usingGeneratedKeyColumns("ID");
//					//-Map<String, Object> parameters = new HashMap<String, Object>();
//					//-parameters.put(message, m.)
//					//-List<MessageModel> r = jdbcTemplate.query("INSERT INTO messages (USERID, MESSAGECONTENT) VALUES (?,?)");
					addMessage(results.get(i).getId(), message);
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public List<DisplayMessageModel> displayMessages() {
		// TODO Auto-generated method stub
		List<UserModel> results = jdbcTemplate.query("SELECT * FROM users", new UsersMapper());
		List<MessageModel> messageresults = jdbcTemplate.query("SELECT * FROM messages LIMIT 5", new MessagesMapper());
		List<DisplayMessageModel> e = new ArrayList();
		for (MessageModel messageModel : messageresults) {
			for (int i = 0; i < results.size();i++) {
				if (Objects.equals(results.get(i).getId(), messageresults.get(i).getUserId())) {
					e.add(new DisplayMessageModel(0, messageModel.getMessageContent(), results.get(i).getUserName()));
				}
			}
		}
		return e;
	}
}
