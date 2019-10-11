package com.ub.service.webboot.cicdbasicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AppBootStartup {

	public static void main(String[] args) {
		System.out.println("Application started.");
		//Here we start spring web with dispatcher servlet using Spring Boot
		SpringApplication.run(AppBootStartup.class, args);
		System.out.println("end of the application.");

	}
}
