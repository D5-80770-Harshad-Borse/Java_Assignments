package Shape;

public class Square extends Polygon {
	private int side;
	
	@Override
	public void calcArea() {
		double area;
		area = this.side * this.side;
		System.out.println("Area of Square = "+area);		
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
}