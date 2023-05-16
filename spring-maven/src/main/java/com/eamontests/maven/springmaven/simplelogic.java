package com.eamontests.maven.springmaven;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class simplelogic implements InitializingBean {

	public simplelogic() {
		System.out.println("Class Was Created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Class Was Initialised");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was Initialised in afterPropertiesSet");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Is Destryed");
	}
	

}
