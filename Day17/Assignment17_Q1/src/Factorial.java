import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter your no. to calculate factorial= ");
		number=sc.nextInt();
		int result = Stream.iterate(1, i -> i+1)
				.limit(number)
				.reduce(1, (x,y) -> x * y);
		System.out.println("Factorial upto your no.: "+result);
	}

}
