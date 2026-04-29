package jdbc;
import java.util.*;

public class CrudOperation {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		StudentDAO st = new StudentDAO();
		System.out.println("Enter Username");
		String username= sc.nextLine();
		
		System.out.println("Enter Password");
		String password= sc.nextLine();
		
		if(st.login(username, password)) {
			System.out.println("Welcome To XYZ Management System");
		}
		else {
			System.out.println("Please Login first (Invalid Credentials)");
		}
		
		sc.close();

	}

}
