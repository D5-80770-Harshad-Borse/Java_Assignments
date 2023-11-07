package Shape;

//import Shape.BoundedShape;

public class Circle extends BoundedShape {
	private int radius;
	private static double pi = 3.142;
	
	@Override
	public void calcArea() {
	double area;
	area = pi * this.radius * this.radius;
	System.out.println("Area of Circle = "+area);
		
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}