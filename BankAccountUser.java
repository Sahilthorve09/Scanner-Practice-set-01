
import java.util.Scanner;
public class BankAccountUser {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);  // scanner class object
		
		System.out.println("Enter Account Number: ");
		int accNo = scan.nextInt();
		
		scan.nextLine(); // to execute code on next line
		
		System.out.println("Enter Account Holder Name: ");
		String accName = scan.nextLine();
		
		BankAccountLogic data = new BankAccountLogic(accNo, accName, 2000.0); //default value is set as deposit value
		data.displayDetail(); // display detail
		
		BankAccountOperation op = new BankAccountOperation();//perform transaction operation
		data.displayDetail();
		
		}
	
}
