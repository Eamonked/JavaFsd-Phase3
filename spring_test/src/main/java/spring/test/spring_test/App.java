package spring.test.spring_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
		
		int result = customerDao.saveCustomer(new Customer(10, "Eamon", "Kendrick"));
	
		System.out.println(result);
	}
}
