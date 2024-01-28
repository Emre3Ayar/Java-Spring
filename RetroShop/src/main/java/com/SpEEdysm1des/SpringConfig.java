package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpEEdysm1des.services.ConsolesBusinessService;
import com.SpEEdysm1des.services.ConsolesBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="consoleBusinessService", initMethod = "init", destroyMethod = "destroy")
	//@SessionScope : Executes Interface on every reloaded page
	public ConsolesBusinessServiceInterface getConsolesBusiness() {
		return new ConsolesBusinessService();
	}
}
