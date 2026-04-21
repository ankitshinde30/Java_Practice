package Oops.Inheritance.Hierarchical;

public class Rectangle  extends Shape{

	public void areaOfRectangle() {
		area=length*breadth;
		System.out.println("Area Of Rectangle Is : "+area);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.areaOfRectangle();
		
		Circle c1=new Circle();
		c1.areaOfCircle();
		

	}

}
