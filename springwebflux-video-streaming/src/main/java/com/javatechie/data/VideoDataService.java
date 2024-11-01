package com.javatechie.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javatechie.models.VideoModel;
import com.javatechie.models.VideosMapper;

//MySQL database
@Primary
@Repository
public class VideoDataService implements VideoDataAccessInterface{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<VideoModel> getVideos() {
		List<VideoModel> results = jdbcTemplate.query("SELECT * FROM videos", new VideosMapper());
		System.out.println(results);
		return results;
	}
}