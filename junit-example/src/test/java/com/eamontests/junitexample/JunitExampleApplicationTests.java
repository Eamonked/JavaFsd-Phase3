package com.eamontests.junitexample;

import org.apache.logging.log4j.*;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Nested
@DisplayName("Spring Boot application test class")
class JunitExampleApplicationTests {

	static Logger log = LogManager.getLogger();

	@BeforeAll
	static void setup() {
		log.info("@BeforeAll It Execute Only once b4 all test methods Inside the class");

	}

	@BeforeEach
	void Hello() {
		log.info("@ Before Each It Execute Only once b4 all test methods Inside the class");

	}
	@Disabled("Method 4 is not Implemented")
	@DisplayName("Method 1 Test")
	@Test
	void testMethod1() {
		log.info("Inside Test Method");
	}

	@Test
	void testMethod2() {
		log.info("Inside Test Method");
		
	}
	
	@DisplayName("Method 3 Test")
	@Test
	void testMethod3() {
		log.info("Inside Test Method");
	}
	
	@DisplayName("Method 4 Test")
	@AfterEach
	@Test
	void testMethod4() {
		log.info("@ After Each It Execute after all test methods Inside the class");
	}
	
	@DisplayName("Method 5 Test")
	@Test
	@AfterAll
	static void tearDown() {
		log.info("@ After All It Execute Only once after all test methods Inside the class");
	}

}
