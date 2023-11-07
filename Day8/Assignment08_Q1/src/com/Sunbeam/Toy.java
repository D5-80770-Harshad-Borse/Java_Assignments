package com.Sunbeam;

import java.util.Scanner;

public class Toy extends Shop {
	String agegroup;
	String type;
	
	public Toy()
	{
		
	}
	
	public Toy(String title, double price, String agegroup, String type) {
		super(title, price);
		this.agegroup = agegroup;
		this.type = type;
	}
	public String getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Toy [agegroup=" + agegroup + ", type=" + type + "]";
	}
	public void vatCalculation()
	{
		double totalBill=super.price + super.price*0.05;
		System.out.println("Total bill is= "+totalBill);
		
	}
	public void Accept()
	{	Scanner sc= new Scanner(System.in);
		System.out.println("Enter Agegroup= ");
		agegroup=sc.next();
		System.out.println("Enter title= ");
		super.title=sc.next();
		System.out.println("Enter type=");
		type=sc.next();
		System.out.println("Enter Price= ");
		super.price=sc.nextDouble();
	}
}
