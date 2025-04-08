
public class BankAccountLogic {
	
	
	// Instance/Global variable
	int accNo;
	String accName;
	double balance;
	
	public BankAccountLogic(int accNo,String accName,double balance ) {
		this.accNo = accNo;       
		this.accName = accName;   // global variable = local variable
		this.balance = balance;
	}
	
	//   withdraw amount logic
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount>0 && balance >= withdrawAmount) {
			this.balance = balance - withdrawAmount;
			System.out.println("Money Withdraw: "+withdrawAmount);
			System.out.println("Remaining Balance: "+balance);
			System.out.println("Thank You Visit Again.....");
			System.out.println("----------------------------------------");
		}
		//logic for comparing balance with amount if amount is greater than balance err will show
		else {
			System.out.println("Sorry..Inssuficent Balance: "+balance);
			System.out.println("Please try again with valid amount....");
			System.out.println("----------------------------------------");
		}
	}
	
	//  Add money logic
	public void addMoney(double amount) {
		balance = balance + amount;
		System.out.println("Money Added: "+amount);
		System.out.println("Total Balance: "+balance);
		System.out.println("Thank You Visit Again.....");
		System.out.println("----------------------------------------");
	}
	
	// display details
	public void displayDetail() {
		System.out.println("------ Account Details ------");
		System.out.println("Account Number: "+this.accNo);
		System.out.println("Account Holder Name: "+this.accName);
		System.out.println("Total Balnce: "+this.balance);
		System.out.println("----------------------------------------");
	}
	
}
