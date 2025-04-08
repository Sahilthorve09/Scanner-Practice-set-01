import java.util.Scanner;

public class BankAccountOperation {

	public BankAccountOperation() {
        Scanner sc = new Scanner(System.in);
        BankAccountLogic set = new BankAccountLogic(0, null, 0); // You can set proper values here

        char continueChoice;

        do {
            System.out.println("Do you want to perform a transaction? (y/n): ");
            continueChoice = sc.next().charAt(0);

            if (continueChoice == 'y') {
                System.out.println("Do you want to withdraw or deposit? (w/d): ");
                char transactionType = sc.next().charAt(0);

                if (transactionType == 'w') {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    set.withdraw(amount); // assuming withdraw() method exists in BankAccountLogic
                } else if (transactionType == 'd') {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    set.addMoney(amount); // assuming deposit() method exists
                } else {
                    System.out.println("Invalid transaction type.");
                }
            } else if (continueChoice != 'n') {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }

        } while (continueChoice == 'y');

        System.out.println("Thank you for using our service.");
    }
	}

	
