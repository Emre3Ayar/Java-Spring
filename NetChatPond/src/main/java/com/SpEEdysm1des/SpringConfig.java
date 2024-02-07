package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpEEdysm1des.data.UserDataAccessInterface;
import com.SpEEdysm1des.data.UsersDataService;
import com.SpEEdysm1des.services.UsersBusinessService;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="consoleBusinessService", initMethod = "init", destroyMethod = "destroy")
	//@SessionScope : Executes Interface on every reloaded page
	public UsersBusinessServiceInterface getConsolesBusiness() {
		return new UsersBusinessService();
	}
	//MySQL database
	@Bean(name="userDAO")
	public UserDataAccessInterface getData() {
		return new UsersDataService();
	}
}
