package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.SpEEdysm1des.services.OrdersBusinessService;
import com.SpEEdysm1des.services.OrdersBusinessService2;
import com.SpEEdysm1des.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	//@Bean : with initMethod and destroyMethod, only executes one time(open application)
	@Bean(name="orderBusinessService", initMethod = "init", destroyMethod = "destroy")
	//@SessionScope : Executes Interface on every reloaded page
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService2();
	}
}
