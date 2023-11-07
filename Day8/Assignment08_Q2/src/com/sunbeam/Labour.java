package com.sunbeam;

import java.util.Scanner;

public class Labour extends Employee{
	
	double rate;
	int hours;
	
	public Labour()
	{
		
	}
	
	
	public Labour(String name, int age, int id, double salary, double rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		
		if(this.rate <=0)
			throw new EmployeeException("Invalid Rate", this.rate);
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(this.hours <0)
			throw new EmployeeException("Invalid Hours", this.hours);
		this.hours = hours;
	}
	
	@Override
	public  double calSalary()
	{
		super.salary = this.hours * this.rate;
		return salary;
		
	}
	@Override
	public void accpecData(Scanner sc)
	{	super.accpecData(sc);
		System.out.print("Enter the Rate = ");
		rate = sc.nextDouble();
		
		System.out.print("Enter the Hours = ");
		hours = sc.nextInt();
	}


	@Override
	public String toString() {
		return super.toString()+ "Labour [rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	
	

}