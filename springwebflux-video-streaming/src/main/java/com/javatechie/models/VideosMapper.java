package com.javatechie.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.javatechie.models.VideoModel;

//MySQL database
public class VideosMapper implements RowMapper<VideoModel>{
	
	@Override
	public VideoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		VideoModel video = new VideoModel(rs.getLong("id"), rs.getString("username"));
		return video;
	}
}
