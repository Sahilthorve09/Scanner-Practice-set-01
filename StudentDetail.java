
import java.util.Scanner;
public class StudentDetail {
	
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.println("Enter your Roll No: ");
		int rollNo = st.nextInt();
		
		st.nextLine();		
		System.out.println("Enter your Name: ");
		String name = st.nextLine();
		
		System.out.println("Enter your Mathematics-01 Marks: ");
		int m1 = st.nextInt();
		
		System.out.println("Enter your Mathematics-02 Marks: ");
		int m2 = st.nextInt();
		
		System.out.println("Enter your Cloud Computing Marks: ");
		int cc = st.nextInt();
		
		StudentDetailsLogic data = new StudentDetailsLogic(rollNo, name, m1, m2, cc);
		data.details();
		data.marks();
		
	}
	
}
