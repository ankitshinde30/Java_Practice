package Arrays;
// import java.util.*;

public class Min_Max {

    public static void min_maxValue(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i< numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("Largest Value in an Array is "+max);
        System.out.println("Smallest value in an Array is "+min);
    }
    public static void main(String[] args) {
        int numbers[]={1,5,3,7,9,2,6};

        min_maxValue(numbers);
    }
}
