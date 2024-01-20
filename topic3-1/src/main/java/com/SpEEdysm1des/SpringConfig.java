package com.SpEEdysm1des;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpEEdysm1des.services.OrdersBusinessService;
import com.SpEEdysm1des.services.OrdersBusinessService2;
import com.SpEEdysm1des.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {
	@Bean(name="orderBusinessService")
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService2();
	}
}
