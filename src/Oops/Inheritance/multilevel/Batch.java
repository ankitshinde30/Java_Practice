package Oops.Inheritance.multilevel;

public class Batch extends Student{
	int bid;
	String bName;
	
		public void assign() {
			sid=100;
			name="Ankit";
			cid=1000;
			cName="python";
			bid=121;
			bName = "PFSD001";
		}
		
		public void display() {
			System.out.println("Student Id : "+sid);
			System.out.println("Student Name : "+name);
			System.out.println("Course Id : "+cid);
			System.out.println("Course Name : "+cName);
			System.out.println("Batch Id : "+bid);
			System.out.println("Batch Name : "+bName);
		}
	
}
