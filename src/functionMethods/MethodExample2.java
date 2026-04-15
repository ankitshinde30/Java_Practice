package functionMethods;

public class MethodExample2 {
	   int num1;
	   int num2;
	   int result;

	   public MethodExample2() {
	   }

	   public void assign(int x, int y) {
	      this.num1 = x;
	      this.num2 = y;
	   }

	   public void calculate() {
	      this.result = this.num1 + this.num2;
	   }

	   public void display() {
	      System.out.println("The Sum IS " + this.result);
	   }

	   public static void main(String[] args) {
	      MethodExample2 t1 = new MethodExample2();
	      t1.assign(10, 20);
	      t1.calculate();
	      t1.display();
	   }
	}
