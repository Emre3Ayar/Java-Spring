package com.SpEEdysm1des.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpEEdysm1des.model.VideoModel;

//MySQL database
public class VideosMapper implements RowMapper<VideoModel>{
	
	@Override
	public VideoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		VideoModel video = new VideoModel(rs.getLong("id"), rs.getString("username"));
		return video;
	}
}
