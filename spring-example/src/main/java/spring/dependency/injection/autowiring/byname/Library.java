package spring.dependency.injection.autowiring.byname;

public class Library {
	
	private String bookType;
	
	private Book book;

	public Library() {
		super();
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void libraryInfo() {
		System.out.println("Library Book Type:: "+ bookType);
		System.out.println("Library Book:: "+ book);
		
	}
	public void display() {
		libraryInfo();
		book.bookInfo();
	}
}
