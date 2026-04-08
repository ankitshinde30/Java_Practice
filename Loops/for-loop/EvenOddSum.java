import java.util.Scanner;

public class EvenOddSum{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of integers");
            int n = sc.nextInt();

            System.out.print("Enter the integers: ");

            int evenSum=0;
            int oddSum = 0;

            for(int i=0; i<n;i++){
                int num = sc.nextInt();
                if(num%2==0){
                    evenSum+=num;
                }else{
                    oddSum+=num;
                }
            }
            System.out.println("Sum of even numbers: "+evenSum);
            System.out.println("Sum of odd numbers: "+oddSum);

            sc.close();
        }
}   