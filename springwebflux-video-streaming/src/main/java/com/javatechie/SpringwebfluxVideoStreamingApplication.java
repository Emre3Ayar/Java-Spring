package com.javatechie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.service.StreamingService;

import reactor.core.publisher.Mono;

@SpringBootApplication
@ComponentScan("com.javatechie")
public class SpringwebfluxVideoStreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxVideoStreamingApplication.class, args);
	}

}
