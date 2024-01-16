package com.example.SpEEdysm1des;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpEEdysm1des")
public class RetroShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetroShopApplication.class, args);
	}

}
