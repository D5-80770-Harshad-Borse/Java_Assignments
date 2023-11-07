package EmployeeSalary;

import java.util.Scanner;

public class commissionEmployee extends Employee {

	private double commisionRate;
	private double grossSales;

	public commissionEmployee() {
	}

	public commissionEmployee(double commisionRate, double grossSales) {
		super();
		this.commisionRate = commisionRate;
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	@Override
	public void inputData(Scanner sc) {
		super.inputData(sc);
		System.out.println("Enter Commission Rate");
		this.commisionRate = sc.nextDouble();
		System.out.println("Enter Gross Sales");
		this.grossSales = sc.nextDouble();
	}

	@Override
	public double totalSalary() {
		return this.commisionRate * this.grossSales;
	}
	
	public void addBonus(int bonus) {
		this.commisionRate += bonus / 100 * this.commisionRate ;
	}

}