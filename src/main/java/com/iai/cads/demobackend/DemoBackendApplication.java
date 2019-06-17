package com.iai.cads.demobackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class DemoBackendApplication {


	@Bean
	public RestTemplate restTemplate1(){
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoBackendApplication.class, args);
	}

}
