package spring.dependency.injection.autowiring.byname;

public class Book {
	
	private String isbn;
	private double price;
	
	public Book() {
		super();
		System.out.println("Book is created");
	}
	public void bookInfo() {
		
	}
	public Book(String isbn, double price) {
		super();
		this.isbn = isbn;
		this.price = price;
	}
}
