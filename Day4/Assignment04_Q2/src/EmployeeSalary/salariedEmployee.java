package EmployeeSalary;

import java.util.Scanner;

public class salariedEmployee extends Employee{
	private double weeklySalary;
	
	public salariedEmployee() {
		
	}
	public salariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void inputData(Scanner sc) {
		super.inputData(sc);
		System.out.println("Enter Weekly Salary");
		this.weeklySalary = sc.nextDouble();
	}
	
	@Override
	public double totalSalary() {
		return this.weeklySalary;
	}
	@Override
	public void addBonus(int bonus) {
		this.weeklySalary += bonus / 100 * this.weeklySalary ;
	}

	
}