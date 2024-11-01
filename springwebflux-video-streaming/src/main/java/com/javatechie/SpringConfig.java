package com.javatechie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatechie.data.VideoDataAccessInterface;
import com.javatechie.data.VideoDataService;
import com.javatechie.service.VideosBusinessService;
import com.javatechie.service.VideosBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="userBusinessService", initMethod = "init", destroyMethod = "destroy")
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
