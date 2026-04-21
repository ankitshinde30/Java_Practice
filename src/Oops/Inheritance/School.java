package Oops.Inheritance;

public class School{
	Student student;
	
	School(Student student){
		this.student = student;
	}
	
	void display() {
		System.out.println("Student Name: "+ student.name);
		System.out.println("roll No : "+ student.rollNo);
	}

}
