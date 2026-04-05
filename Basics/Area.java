class Area
{
	public static void main(String args[]){
		
		float pi = 3.14f;
		int radius = 4;
		int side1= 35;
		int side2= 67;

		double areaOfCircle=pi*radius*radius;
		int areaOfRectangle= side1*side2;
		int areaOfSquare= side1*side1;
		double areaOfTriangle=0.5*side1*side2;

		System.out.println("Area of Circle is "+ areaOfCircle);
		System.out.println("Area of Rectangle is "+ areaOfRectangle);
		System.out.println("Area of Square is "+ areaOfSquare);
System.out.println("Area of Triangle is "+ areaOfTriangle);

}

}