package com.eamontests.maven.springmaven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class plainSimpleLogic {
	public void simplelogic() {
		System.out.println("Class Was Created");
	}
	

	public void init() {
		System.out.println("Class Was Initialised");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was Initialised in afterPropertiesSet");
		
	}

	public void destroyed() {
		System.out.println("Bean Is Destryed");
	}
	

}


