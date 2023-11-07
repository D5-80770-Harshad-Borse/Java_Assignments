package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee{
	
	String target;
	double comm;
	
	
	public Salesman(String name, int age, int id, double salary, String target, double comm) {
		super(name, age, id, salary);
		this.target = target;
		this.comm = comm;
	}
	
	public Salesman()
	{
		
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		
		if(this.comm <=0)
			throw new EmployeeException("Invalid Commission", this.comm);
		this.comm = comm;
	}

	@Override
	public double calSalary() {
		super.salary = this.comm + super.salary;
		return salary;
	}
	@Override
	public void accpecData(Scanner sc)
	{	super.accpecData(sc);
		System.out.print("Enter the Target = ");
		target = sc.next();
		
		System.out.print("Enter the Commission = ");
		comm = sc.nextDouble();
	}

	@Override
	public String toString() {
		
		return super.toString()+ "Salesman [target=" + target + ", comm=" + comm + "]";
	}
	
	
	
	
	
	

}