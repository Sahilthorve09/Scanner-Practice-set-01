
public class Employee {
	
	int empId;
	String empName;
	String empPost;
	double empSalary;
	
	public void EmployeeData(int empId,String empName,String empPost,double empSalary) {
		this.empId = empId;
		this.empName = empName;	
		this.empPost = empPost;
		this.empSalary = empSalary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Post: "+empPost);
		System.out.println("Salry: "+empSalary);
		System.out.println("------------------------------");
	}
	
	public void bonus() {
		if (this.empSalary < 50000) {
            System.out.println(this.empSalary * 0.10);;
        } else {
            System.out.println(this.empSalary * 0.05);
        }
	}
	
}
