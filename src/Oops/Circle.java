package Oops;

public class Circle extends Shape {

		public void areaOfCircle() {
			area=pi*radius*radius;
			System.out.println("Area of circle: "+ area);
		}
		
	public static void main(String[] args) {
	
		Circle c1=new Circle();
		c1.areaOfCircle();

	}

}
