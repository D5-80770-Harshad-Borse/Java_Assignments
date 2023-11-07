package com.Sunbeam;

import java.util.Scanner;

public class Albums extends Shop{
	String singer; 
	String musician;
	
	public Albums()
	{
		
	}
	
	
	public Albums(String singer, String musician) {
		super();
		this.singer = singer;
		this.musician = musician;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMusician() {
		return musician;
	}
	public void setMusician(String musician) {
		this.musician = musician;
	}
	@Override
	public String toString() {
		return "Albums [singer=" + singer + ", musician=" + musician + "]";
	}
	public void taxCalculation()
	{
		double totalBill=super.price + super.price*0.1;
		System.out.println("Total bill is= "+totalBill);
		
	}
	public void Accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter title= ");
		super.title=sc.next();
		System.out.println("Enter Singer=");
		singer=sc.next();
		System.out.println("Enter Musician= ");
		musician=sc.next();
		System.out.println("Enter Price= ");
		super.price=sc.nextDouble();
	}
	

}
