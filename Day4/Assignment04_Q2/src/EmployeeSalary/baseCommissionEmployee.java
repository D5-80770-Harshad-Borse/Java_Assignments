package EmployeeSalary;

import java.util.Scanner;

public class baseCommissionEmployee extends commissionEmployee {
	private double baseSalary;

	public baseCommissionEmployee() {
	}

	public baseCommissionEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void inputData(Scanner sc) {
		super.inputData(sc);
		System.out.println("Enter Base Salary");
		this.baseSalary = sc.nextDouble();
	}
	
	@Override
	public double totalSalary() {
		return super.totalSalary() + this.baseSalary;
	}
	
	public void addBonus(int bonus) {
		this.baseSalary += bonus / 100 * this.baseSalary ;
	}

}