package module4;
import java.util.*;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
			int arr[],num,i;
			System.out.println("Enter the number of elements you want");
			num= sc.nextInt();
			
			arr= new int[num];
			System.out.println("Enter the Array elements");
			for(i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Array elements are");
			for(i=0;i<arr.length;i++) {
				 System.out.println(arr[i]);
			}
			
			
	}

}
