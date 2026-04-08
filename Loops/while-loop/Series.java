class Series {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 20) {
            System.out.print(i + " ");
            
            if (i + 3 <= 20)
                System.out.print((i + 3) + " ");
            
            i = i + 2;
        }
    }
}