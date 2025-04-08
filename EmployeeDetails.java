
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Employee data = new Employee();
		
		System.out.println("Employee ID: ");
		int empId = scan.nextInt();
		scan.nextLine();
		System.out.println("Name of Employee: ");
		String empName = scan.nextLine();
		System.out.println("Employee Salary: ");
		double empSalary = scan.nextDouble();
		
		System.out.println("Post of Employee: ");
		String empPost = scan.nextLine();
		
		
		
		data.EmployeeData(empId, empName, empPost, empSalary);
		
		System.out.println("---------- Employee Details ----------");
		data.displayDetails();
		
		data.bonus();
		
		
	}
}
