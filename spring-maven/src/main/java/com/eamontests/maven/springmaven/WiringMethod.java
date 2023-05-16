package com.eamontests.maven.springmaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WiringMethod {
	
	@Bean(initMethod = "init", destroyMethod = "destroyed")
	public plainSimpleLogic  plainsimplelogic () {
		return new plainSimpleLogic();
	}
	

}
