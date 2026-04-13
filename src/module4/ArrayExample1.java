package module4;

public class ArrayExample1 {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(arr[5]);

        int result = arr[4] + arr[7];
        System.out.println("The Sum of two Number is = " + result);

        System.out.println("Elements of Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Index is " + i + " value " + arr[i]);
        }

        // Reverse logic (outside loop)
        System.out.println("Reverse an Array");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reverse of Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Index is " + i + " value " + arr[i]);
        }
    }
}