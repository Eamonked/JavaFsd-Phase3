package com.eamontests.springbootcrudoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SpringBootCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOperationsApplication.class, args);
	}

}
