package com.sunbeam;

import java.util.Scanner;

abstract public class Employee extends Person {
	
	int id;
	double salary;
	
	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public Employee()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(this.salary <=0)
			throw new EmployeeException("Invalid Commission", this.salary);
		
		this.salary = salary;
	}
	
	
	public abstract double calSalary();
	
	public void accpecData(Scanner sc)
	{
		System.out.print("Enter the ID of Employee = ");
		id = sc.nextInt();
		
		System.out.print("Enter the Salary of Employee = ");
		salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
	
	

}