package EmployeeSalary;

import java.util.Scanner;

abstract public class Employee {
	
	private String socialSecurityNumber;
	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
	}
	
	public void inputData(Scanner sc) {
		
	}
	
	public void addBonus(int bonus) {}
	
	public abstract double totalSalary();
	
}