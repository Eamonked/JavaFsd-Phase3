package spring_project;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayStudentInfo() {
		System.out.println("Hello " + name);
	}
}
