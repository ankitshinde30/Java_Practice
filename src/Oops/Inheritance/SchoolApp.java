package Oops.Inheritance;

public class SchoolApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Ankit Shinde";
		s.rollNo= 101;
		
		School school = new School(s);
		school.display();

	}

}
