package person;

public class Person {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date p1 = new Date(28, 9, 1983);
		p1.display();
		
		Date p2 = (Date) p1.clone();
		p2.display();
		
		p2.setMonth(2);
		p2.display();
		p1.display();
	}

}
