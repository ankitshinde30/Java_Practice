package Oops;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		int id;
		String name,email;
		double salary;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		id= sc.nextInt();
		System.out.println("Enter Employee Name");
		name= sc.next();
		System.out.println("Enter Employee EmailId");
		email= sc.next();
		System.out.println("Enter Employee Salary");
		salary= sc.nextDouble();
		
		
		
		Employee e1= new Employee();
		
		e1.setId(id);
		e1.setId(name);
		e1.setEmail(email);
		e1.setSalary(salary);
		
		System.out.println("ID : "+e1.getId());
		System.out.println("Name : "+e1.getName());
		System.out.println("Email : "+e1.getEmail());
		System.out.println("Salary : "+e1.getSalary());
		
	}

}
