package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("employeedao");
		
		int result = employeeDao.saveEmployee(new Employee(100, "John", 100000));
		
		int result2 = employeeDao.saveEmployee(new Employee(1000, "Eamon", 10005555));
		
		int result3 = employeeDao.deleteEmployee(new Employee(100));
		
		System.out.println(result);
	}
}
