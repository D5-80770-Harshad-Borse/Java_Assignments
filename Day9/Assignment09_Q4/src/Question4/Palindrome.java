package Question4;

import java.util.Scanner;

public class Palindrome {

	
	public static boolean isPalindrome(String str)
    {
        String rev = "";
 
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        if (str.equals(rev)) {
            ans = true;
        }

        return ans;
    }

	
	public static void displayoutput(boolean b) {
    if(b == true)
    {
    	System.out.println("The String is Palindrome");
    }
    else
    	System.out.println("The String is not Palindrome");
   
	}
	

	
	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the String : ");
        String str =sc.next();
 
        boolean A = isPalindrome(str);
        
        displayoutput(A);
	}
}





