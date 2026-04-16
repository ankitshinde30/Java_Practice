package functionMethods;

class Student{
	
	int id;
	String name;
	String email;
	
	
	public Student() {//Default Constructor
		id=100;
		name="Amit";
		email="amit@gmail.com";
	}
	
	public Student(int sid,String n, String e) {//Parameterized Constructor
		id=sid;
		name=n;
		email=e;
	}
	
	public Student(Student s) {//Copy Constructor
		id=s.id;
		name=s.name;
		email=s.email;
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
		s1.display();//Default Constructor
		Student s2 = new Student(101,"Omkar","Omkar@gmail.com");
		s2.display();//Parameterized Constructor
		Student s3 = new Student(102,"Kaushal","Kaushal@gmail.com");
		s3.display();//Parameterized Constructor

		Student s4 = new Student(s3);
		s4.display();//Copy Constructor
	}

}
