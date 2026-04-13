package module4;
import java.util.*;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String arr[];
		int names,i;
		System.out.println("Enter the groupsize  of students  you want");
		names= sc.nextInt();
		
		arr= new String[names];
		System.out.println("Enter the names of Students");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		System.out.println("Student Names are");
		for(i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		}
		
	}

}
