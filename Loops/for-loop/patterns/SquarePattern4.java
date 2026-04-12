public class SquarePattern4 {
    
    public static void main(String[] args) {
        
        // Define number of rows and columns
        int rows = 5;      // Number of rows (vertical)
        int columns = 5;   // Number of columns (horizontal)
        
        // Outer loop → Controls ROWS
        for (int row = 1; row <= rows; row++) {
            
            // Inner loop → Controls COLUMNS
            for (int col = columns ; col >= 1; col--) {
                System.out.print(row + " ");               }
            
            // After completing one row, move to next line
            System.out.println();
        }
    }
}