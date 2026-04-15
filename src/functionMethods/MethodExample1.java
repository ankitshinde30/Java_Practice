package functionMethods;

public class MethodExample1 {
	   int num1;
	   int num2;
	   int result;

	   public MethodExample1() {
	   }

	   public void assign() {
	      this.num1 = 10;
	      this.num2 = 20;
	   }

	   public void calculate() {
	      this.result = this.num1 + this.num2;
	   }

	   public void display() {
	      System.out.println("The Sum IS " + this.result);
	   }

	   public static void main(String[] args) {
	      MethodExample1 t1 = new MethodExample1();
	      t1.assign();
	      t1.calculate();
	      t1.display();
	   }
	}
