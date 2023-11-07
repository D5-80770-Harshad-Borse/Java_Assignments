package Question1;

public class teststring {

	public static void main(String[] args) {
		//1
		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		System.out.println(s1 == s2);		//true
		System.out.println(s1.equals(s2));	//true
		System.out.println();
		
		//2
		String s3 = new String("Sunbeam");
		String s4 = new String("Sunbeam");
		System.out.println(s3 == s4);		//false
		System.out.println(s3.equals(s4));	//true
		System.out.println();
		
		//3
		String s5 = "Sunbeam";
		String s6 = new String("Sunbeam");
		System.out.println(s5 == s6);		//false
		System.out.println(s5.equals(s6));	//true
		System.out.println();
		
		//4
		String s7 = "Sunbeam";
		String s8 = "Sun" + "beam";
		System.out.println(s7 == s8);		//true
		System.out.println(s7.equals(s8));	//true
		System.out.println();
		
		//5
		String s9 = "Sunbeam";
		String s10 = "Sun";
		String s11 = s10 +"beam";
		System.out.println(s9 == s11);		//false
		System.out.println(s9.equals(s11));	//true
		System.out.println();
		
		//6
		String s12 = "Sunbeam";
		String s13 = new String("Sunbeam").intern();
		System.out.println(s12 == s13);			//true
		System.out.println(s12.equals(s13));	//true		
		System.out.println();
		
		//7
		String s14 = "Sunbeam";
		String s15 = "SunBeam";
		System.out.println(s14 == s15);						// false
		System.out.println(s14.equals(s15)); 				// false
		System.out.println(s14.equalsIgnoreCase(s15));	 	// true
		System.out.println(s14.compareTo(s15)); 			// 32
		System.out.println(s14.compareToIgnoreCase(s15));   // 0
		System.out.println();
	
	}

}
