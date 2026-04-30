package jdbc;
import java.util.*;

public class CrudOperation {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int ch,choice;
		
		StudentDAO st = new StudentDAO();
		System.out.println("Enter Username");
		String username= sc.nextLine();
		
		System.out.println("Enter Password");
		String password= sc.nextLine();
		
		if(st.login(username, password)) {

			do {
				System.out.println("*************************************");
				System.out.println("**Welcome to XYZ Management System **");
				System.out.println("*************************************");
				
				System.out.println("Select Your Choice");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. View");
				choice = sc.nextInt();
				
				switch(choice){
					case 1: 
							st.InsertRecord();
							break;
					case 2: 
							st.UpdateRecord();
							break;
					case 3:
							st.deleteRecord();
							break;
					case 4:
						 	st.viewRecord();
						 	break;
					default: 
								System.out.println("Please enter valid Choice");;
								
				}
				System.out.println("Do you wants to continue y/n");
				ch=sc.next().charAt(0);
			}while(ch=='y');
		}
		else {
			System.out.println("Please Login first (Invalid Credentials)");
		}
		
		
		sc.close();

	}

}
