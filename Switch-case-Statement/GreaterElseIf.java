import java.util.Scanner;

public class GreaterElseIf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println("Greatest: " + a);
            } else if (b > a && b > c) {
                System.out.println("Greatest: " + b);
            } else {
                System.out.println("Greatest: " + c);
            }
        }
    }
}
