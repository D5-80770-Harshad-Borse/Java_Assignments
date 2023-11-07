package Question1;

public class teststringBuffer {

	public static void main(String[] args) {
		//1
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println(s1 == s2);		//false
		System.out.println(s1.equals(s2));	//false
		System.out.println();
		
		//2
		StringBuffer s3 = new StringBuffer("Sunbeam");
		String s4 = new String("Sunbeam");
		//System.out.println(s3 == s4);  	//ERROR
		System.out.println(s1.equals(s4));	//false
		System.out.println();
		
		//3
		String s5 = new String("Sunbeam");
		StringBuffer s6 = new StringBuffer("Sunbeam");
		System.out.println(s5.equals(s6));				//false
		System.out.println(s5.equals(s6.toString()));	//true
		System.out.println();
		
		//4
		StringBuffer s7 = new StringBuffer("Sunbeam");
		StringBuffer s8 = s1.reverse();
		System.out.println(s7 == s8);			//false
		System.out.println(s7.equals(s8));		//false
		System.out.println();
		
		//5
		StringBuilder s9 = new StringBuilder("Sunbeam");
		StringBuilder s10 = new StringBuilder("Sunbeam");
		System.out.println(s9 == s10);			//false
		System.out.println(s9.equals(s10));		//false
		System.out.println();
		
		//6
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); 		//Capacity: 16, Length: 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); 		//Capacity: 16, Length: 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length());		//Capacity: 34, Length: 32
		System.out.println();
		
	}

}
