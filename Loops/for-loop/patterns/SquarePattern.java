public class SquarePattern {
    
    public static void main(String[] args) {
        
        // Define number of rows and columns
        int rows = 4;      // Number of rows (vertical)
        int columns = 5;   // Number of columns (horizontal)
        
        // Outer loop → Controls ROWS
        for (int row = 1; row <= rows; row++) {
            
            // Inner loop → Controls COLUMNS
            for (int col = 1; col <= columns; col++) {
                System.out.print(" 1");   // Print "1" in each column
            }
            
            // After completing one row, move to next line
            System.out.println();
        }
    }
}