public class SquarePattern5 {
    public static void main(String args[]){
        int rows = 5;
        int columns = 5;

        for (int row =1; row<= rows; row++){
            for (int col=1 ; col<=columns; col++){
                if (row%2 ==0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
