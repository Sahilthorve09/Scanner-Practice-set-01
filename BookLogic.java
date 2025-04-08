
public class BookLogic {
	String title;
	String author;
	double price;
	
	public BookLogic(String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Book Name: "+title);
		System.out.println("Book Athor: "+author);
		System.out.println("Book Price: "+price);
	}
}
