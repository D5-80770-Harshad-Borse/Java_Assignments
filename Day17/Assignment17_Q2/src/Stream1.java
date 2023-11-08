import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	//Collections.addAll(list, 9,7,8,6,5,3,2,1,4,0);
	Random random=new Random();
	int sum= Stream.generate(() -> random.nextInt(100))
	.limit(10)
	.reduce(0,(x,y)->x+y);
	
	System.out.println("sum of random integer=  "+sum);
	
	}

}
