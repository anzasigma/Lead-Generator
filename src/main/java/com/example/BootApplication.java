package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"com.example","com.lead.email","com.lead.security"})

public class BootApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
		System.out.println("Spring Application");
		
	}
	

}
