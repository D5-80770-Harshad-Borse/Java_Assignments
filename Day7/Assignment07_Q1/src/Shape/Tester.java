package Shape;

public class Tester {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.calcArea();
		
		Square square = new Square(7);
		square.calcArea();
		
		Rectangle rectangle = new Rectangle(4, 9);
		rectangle.calcArea();
		
		Triangle triangle = new Triangle(5, 5, 5);
		triangle.calcArea();
	}

}
