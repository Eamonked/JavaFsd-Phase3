package spring_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		
	
	Resource resource = new ClassPathResource("applicationContext.xml");
	
	BeanFactory factory  = new XmlBeanFactory(resource);
	
	Student student = (Student)factory.getBean("studentbean");
	
	student.displayStudentInfo();
	
	/*
	 * Employee employee = (Employee)factory.getBean("employeebean");
	 * employee.displayEmployeeInfo();
	 */
	

	}
}
