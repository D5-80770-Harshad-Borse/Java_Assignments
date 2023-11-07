package EmployeeSalary;

import java.util.Scanner;

public class hourlyEmployee extends Employee {
	private double hourlyWage;
	private int hoursWorked;

	public hourlyEmployee() {
	}

	public hourlyEmployee(double hourlyWage, int hoursWorked) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void inputData(Scanner sc) {
		super.inputData(sc);
		System.out.println("Enter Hourly Wage");
		this.hourlyWage = sc.nextDouble();
		System.out.println("Enter Hour of Work");
		this.hoursWorked = sc.nextInt();
	}
	
	@Override
	public double totalSalary() {
		if (this.hoursWorked <= 40)
			return this.hoursWorked * this.hourlyWage;
		else {
			return 40 * this.hourlyWage + (this.hoursWorked - 40) * this.hourlyWage * 1.5;
		}
	}



}