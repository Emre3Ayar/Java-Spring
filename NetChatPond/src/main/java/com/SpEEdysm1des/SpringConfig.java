package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpEEdysm1des.data.UserDataAccessInterface;
import com.SpEEdysm1des.data.UsersDataService;
import com.SpEEdysm1des.services.MessagesBusinessService;
import com.SpEEdysm1des.services.MessagesBusinessServiceInterface;
import com.SpEEdysm1des.services.UsersBusinessService;
import com.SpEEdysm1des.services.UsersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="userBusinessService", initMethod = "init", destroyMethod = "destroy")
	//@SessionScope : Executes Interface on every reloaded page
	public UsersBusinessServiceInterface getConsolesBusiness() {
		return new UsersBusinessService();
	}
	@Bean(name="messageBusinessService", initMethod = "init", destroyMethod = "destroy")
	public MessagesBusinessServiceInterface getMessagesBusiness() {
		return new MessagesBusinessService();
	}
	//MySQL database
	@Bean(name="userDAO")
	public UserDataAccessInterface getData() {
		return new UsersDataService();
	}
	@Bean(name="messageDAO")
	public UserDataAccessInterface getMessageData() {
		return new UsersDataService();
	}
}
