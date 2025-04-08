
public class StudentDetailsLogic {
	
	int rollNo;
	String name;
	int m1;
	int m2;
	int cc;
	
	public StudentDetailsLogic(int rollNo,String name,int m1,int m2,int cc) {
		this.name = name;
		this.rollNo = rollNo;
		this.m2 = m2;
		this.m1 = m1;
		this.cc = cc;
	}
	
	public void details() {
		System.out.println("------------ Student Details ------------");
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Mathematics-1 Marks: "+m1);
		System.out.println("Mathematics-2 Marks: "+m2);
		System.out.println("Cloud Computing Marks: "+cc);
		System.out.println("-----------------------------------------");
	}
	
	public void marks() {
		int total = this.m1 + this.m2 + this.cc;
		float percentage = ((float)total/300)*100;
		System.out.println("Your Total Percentage is: "+percentage);
		if(percentage>=95 && percentage<=100) {
			System.out.println("A grade");
		}
		else if(percentage>=90 && percentage<=94) {
			System.out.println("B grade");
		}
		else if(percentage>=75 && percentage<=89) {
			System.out.println("C grade");
		}
		else if(percentage>=65 && percentage<=74) {
			System.out.println("D grade");
		}
		else if(percentage>=45 && percentage<=64) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Fail...");
		}
	}
	
}
