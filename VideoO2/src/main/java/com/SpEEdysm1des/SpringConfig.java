package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpEEdysm1des.data.VideoDataAccessInterface;
import com.SpEEdysm1des.data.VideoDataService;
import com.SpEEdysm1des.service.VideosBusinessService;
import com.SpEEdysm1des.service.VideosBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="VideosBusinessService", initMethod = "init", destroyMethod = "destroy")
	//@SessionScope : Executes Interface on every reloaded page
	public VideosBusinessServiceInterface getConsolesBusiness() {
		return new VideosBusinessService();
	}
	//MySQL database
	@Bean(name="videoDAO")
	public VideoDataAccessInterface getData() {
		return new VideoDataService();
	}
}
