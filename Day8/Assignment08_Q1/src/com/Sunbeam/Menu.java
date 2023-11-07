package com.Sunbeam;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
//		Books b=new Books();
//		b.Accept();
		Scanner sc=new Scanner(System.in);
		Shop arr[]=new Shop[5];
		
		int count=0;
		double BILL=0;
		double revenue=0;
		
		
		
		while(true) {
		
		System.out.println("0.Exit");
		System.out.println("1.Add Books");
		System.out.println("2.Add Albums");
		System.out.println("3.Add Toy");
		System.out.println("4.Total Bill");
		System.out.println("5.revenue");
		System.out.println("Enter Your choice= ");
		
		int choice;
		choice=sc.nextInt();
		
		if(count==0) {
			System.out.println("THANK YOU FOR SHOPPING");
			System.out.println("YOUR BILL IS: "+BILL);
		}
		
		
		switch (choice) {
		case 1:
			Books b=new Books();
			b.Accept();
			arr[count]=b;
			BILL=BILL+b.getPrice();
			revenue=b.getPrice();
			count++;
			//arr[count++]=new Books[];
			break;
		case 2:
			Albums A=new Albums();
			A.Accept();
			arr[count]=A;
			BILL=BILL+A.getPrice()*0.10;
			revenue=A.getPrice();
			count++;
			
			break;
		case 3:
			Toy T=new Toy();
			T.Accept();
			arr[count]=T;
			BILL=BILL+T.getPrice()*0.05;
			revenue=T.getPrice();
			count++;
	
			break;
		case 4:
			System.out.println("Total bill= "+BILL);
			
			break;
		case 5:
			System.out.println("Revenue= "+revenue);
			break;
		

		default:
			System.out.println("Entered Wrong choice...");
			break;
		}
		}
		
		

	}

}
