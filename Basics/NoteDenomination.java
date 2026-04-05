public class NoteDenomination {
    public static void main(String[] args) {
        int amount = 1789;
        int temp = amount;

        System.out.println("Amount: " + amount);

        int n100 = temp / 100;
        temp = temp % 100;

        int n50 = temp / 50;
        temp = temp % 50;

        int n20 = temp / 20;
        temp = temp % 20;

        int n10 = temp / 10;
        temp = temp % 10;

        int n5 = temp / 5;
        temp = temp % 5;

        int n2 = temp / 2;
        temp = temp % 2;

        int n1 = temp;

        System.out.println("100 : " + n100);
        System.out.println("50  : " + n50);
        System.out.println("20  : " + n20);
        System.out.println("10  : " + n10);
        System.out.println("5   : " + n5);
        System.out.println("2   : " + n2);
        System.out.println("1   : " + n1);
    }
}
