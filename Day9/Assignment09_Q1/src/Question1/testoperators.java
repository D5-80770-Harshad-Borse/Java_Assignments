package Question1;

public class testoperators {

	public static void main(String[] args) {
		
		//1
		String str = "Sunbeam";
		System.out.println("str");		//Sunbeam
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		System.out.println(ch);			// S u n b e a m
		}
		System.out.println();
		
		//2
		String s1 = "Ramdeo";
		String s2 = "Ramraj";
		int diff = s1.compareTo(s2);
		System.out.println(diff);		//-14
		System.out.println();
		
		//3
		String s3 = "Sunbeam";
		String s4 = "Sunbeam";
		int d1 = s3.compareTo(s4);
		System.out.println(d1);			//0
		System.out.println();
		
		//4
		String s5 = "Sunbeam";
		String s6 = "SunBeam";
		int d2 = s5.compareTo(s6);
		System.out.println(d2);			//32
		System.out.println();
		
		//5
		String s7 = "Sunbeam";
		String s8 = "SunBeam";
		int d3 = s7.compareToIgnoreCase(s8);
		System.out.println(d3);			//0
		System.out.println();
		
		//6
		String s9 = "Sunbeam";
		String s10 = "SunBeam";
		boolean e1 = s9.equals(s10);
		System.out.println(e1);			//false
		System.out.println();
		
		//7
		String s11 = "Sunbeam";
		String s12 = "SunBeam";
		boolean e2 = s11.equalsIgnoreCase(s12);
		System.out.println(e2);			//true
		System.out.println();
		
		//8
		String s13 = "ABCD";
		System.out.println("Hashcode() for s13 = "+ s13.hashCode()); 		//2001986
		System.out.println();
		
		//9
		String s14 = "Sunbeam";
		System.out.println("Starts with = "+ s14.startsWith("Sun"));		//true
		System.out.println();
		
		//10
		String s15 = "Sunbeam";
		System.out.println("Ends with = "+ s15.endsWith("Am"));				//false
		System.out.println();
		
		//11
		String s16 = "Sunbeam";
		int index1 = s16.indexOf('b');				//3
		System.out.println(index1);
		int index2 = s16.indexOf("am");				//5
		System.out.println(index2);
		int index3 = s16.indexOf("ba");				//-1
		System.out.println(index3);
		System.out.println();
		
		//12
		String s17 = "SunbeamInfotech";
		String s18 = s17.substring(7);
		System.out.println(s18);
		String s19 = s17.substring(7,11);		//Infotech
		System.out.println(s19);				//Info
		System.out.println();
		
		//13
		String s20 = "Sunbeam";
		String s21 = "Infotech";
		String s22 = s20.concat(s21);
		System.out.println(s20);			//Sunbeam
		System.out.println(s21);			//Infotech
		System.out.println(s22);			//SunbeamInfotech
		System.out.println();
		
	}

}
