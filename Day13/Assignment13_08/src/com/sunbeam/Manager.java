//8. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.
package com.sunbeam;

public class Manager implements Employee {
	 private double basicSalary;
	 private double dearanceAllowance;
	 
	 @Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		return this.basicSalary+this.basicSalary*0.2;
	}
	 public Manager() {
		// TODO Auto-generated constructor stub
	}
	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public double getDearanceAllowance() {
		return dearanceAllowance;
	}


	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}


	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
	}


	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}


	@Override
	public double getSal() {
		
		return this.basicSalary+this.dearanceAllowance;
	}

}
