package com.sunbeam;


import java.util.Scanner;

public class CreditLimitCal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 - Exit");
		System.out.print("Enter Account Number : ");
		int accountNumber = sc.nextInt();
		
		while (accountNumber != 0)
		{
			System.out.print("Enter the pending balance at the beginning of month : ");
          int beginningBalance = sc.nextInt();

          System.out.print("Enter total items charged : ");
          int totalCharges = sc.nextInt();

          System.out.print("Enter total all credits applied in this month : ");
          int totalCredits = sc.nextInt();

          System.out.print("Enter allowed credit limit : ");
          int creditLimit = sc.nextInt();

          int newBalance = beginningBalance + totalCharges - totalCredits;
      
          System.out.println("New balance for next month : " + newBalance);

          if (newBalance > creditLimit) {
              System.out.println("Credit limit exceeded");
          }
          
          System.out.print("\nEnter account number : ");
          accountNumber = sc.nextInt();
		}
	
	}
	
}