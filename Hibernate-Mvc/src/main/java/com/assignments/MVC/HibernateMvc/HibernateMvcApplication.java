package com.assignments.MVC.HibernateMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMvcApplication {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "mysql");

		SpringApplication.run(HibernateMvcApplication.class, args);
		
		

	}

}
