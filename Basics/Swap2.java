public class Swap2 {
    public static void main(String args[]){
        int num1= 25;
        int num2= 50;

        System.out.println("Before Swapping the Number num1 = "+num1);
        System.out.println("Before Swapping the Number num2 = "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping the Number num1 = "+num1);
        System.out.println("After Swapping the Number num2 = "+num2);
    }
}
