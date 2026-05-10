package Arrays;
// import java.util.*;

public class ArrayCC {
    // Arrays As Functions Arguements
    public static void update(int marks []){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;

        }

    }
    public static void main(String[] args) {
        int marks []={95,96,97};

        update( marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
