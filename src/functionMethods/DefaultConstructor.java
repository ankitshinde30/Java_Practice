package functionMethods;

class Student{
	
	int id;
	String name;
	String email;
	
	
	public Student() {
		id=100;
		name="Amit";
		email="amit@gmail.com";
	}
	
	public void display() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email ID : "+email);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();

	}

}
