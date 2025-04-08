
import java.util.Scanner;
public class BookMain {
	
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		
		System.out.println("Enter Book Name: ");
		String title = st.nextLine();
		
		System.out.println("Enter Author Name: ");
		String author = st.nextLine();
		
		System.out.println("Enter Price");
		double price = st.nextDouble();
		
		BookLogic data = new BookLogic(title, author, price);
		
		data.displayDetails();
	}
	
}
