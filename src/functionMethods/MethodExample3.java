package functionMethods;


public class MethodExample3 {
   int num1;
   int num2;

   public MethodExample3() {
   }

   public int add() {
      this.num1 = 10;
      this.num2 = 20;
      return this.num1 + this.num2;
   }

   public static void main(String[] args) {
      MethodExample3 t1 = new MethodExample3();
      int result = t1.add();
      System.out.println("The Sum is" + result);
   }
}
