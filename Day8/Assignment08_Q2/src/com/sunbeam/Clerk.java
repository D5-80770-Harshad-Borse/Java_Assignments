package com.sunbeam;

import java.util.Scanner;

public class Clerk extends Employee {
	
	public Clerk()
	{
		
	}

	@Override
	public double calSalary() {
		if(super.salary <0)
			throw new EmployeeException("Invalid Salary", super.salary);
		return super.salary;
	}
	@Override
	public void accpecData(Scanner sc)
	{	super.accpecData(sc);
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	

}