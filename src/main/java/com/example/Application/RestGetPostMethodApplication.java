package com.example.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.cognizant.controllers"})
public class RestGetPostMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestGetPostMethodApplication.class, args);
	}

}
