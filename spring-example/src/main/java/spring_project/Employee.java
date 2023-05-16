package spring_project;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Constructor Injection.....");
	}


	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	void displayEmployeeInfo() {
		System.out.println("Employee ID:: "+ id);
		System.out.println("Employee Name:: "+ name);
	}
}
