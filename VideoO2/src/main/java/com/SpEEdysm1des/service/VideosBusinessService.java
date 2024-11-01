package com.SpEEdysm1des.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import com.SpEEdysm1des.data.VideoDataAccessInterface;
import com.SpEEdysm1des.model.VideoModel;

//@Service
@Primary
public class VideosBusinessService implements VideosBusinessServiceInterface{

	@Autowired
	VideoDataAccessInterface videosDAO;
	
	@Override
	public List<VideoModel> getVideos() {
		return videosDAO.getVideos();
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
