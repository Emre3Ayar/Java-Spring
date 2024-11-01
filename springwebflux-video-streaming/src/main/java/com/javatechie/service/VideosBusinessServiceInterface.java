package com.javatechie.service;

import java.util.List;

import com.javatechie.models.VideoModel;

public interface VideosBusinessServiceInterface {
	public void init();
	public void destroy();
	public List<VideoModel> getVideos();
}
