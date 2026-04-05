public class InchestoFeet {
    public static void main(String[] args) {
        double inches = 100.0;

        int feet = (int) (inches / 12);
        int remainingInches = (int) inches % 12;

        System.out.println(inches + " inches = " + feet + " feet" +
                (remainingInches > 0 ? " and " + remainingInches + " inches" : ""));
    }
}
