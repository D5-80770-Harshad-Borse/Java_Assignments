package Shape;

public class Rectangle extends Polygon {
	private int length;
	private int breadth;
	
	@Override
	public void calcArea() {
		double area;
		area = this.breadth * this.length;
		System.out.println("Area of Rectangle = "+area);
		
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
