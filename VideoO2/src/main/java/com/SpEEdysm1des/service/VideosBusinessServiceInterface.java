package com.SpEEdysm1des.service;

import java.util.List;

import com.SpEEdysm1des.model.VideoModel;

public interface VideosBusinessServiceInterface {
	public void init();
	public void destroy();
	public List<VideoModel> getVideos();
}
