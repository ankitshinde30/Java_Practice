package module3;
import java.util.Scanner;
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String email;
		int rollNo;
		String city;
		double marks;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		name= sc.nextLine();
		System.out.println("Enter your Email address");
		email= sc.next();
		System.out.println("Enter your city Name");
		city= sc.next();
		System.out.println("Enter your Marks");
		marks= sc.nextDouble();
		System.out.println("Enter your Roll Number");
		rollNo= sc.nextInt();
		
		
		System.out.println("Roll Number" + rollNo);
		System.out.println("Name "+ name);
		System.out.println("Email Id" + email);
		System.out.println("City " + city);
		System.out.println("Marks "+ marks);

	}

}
