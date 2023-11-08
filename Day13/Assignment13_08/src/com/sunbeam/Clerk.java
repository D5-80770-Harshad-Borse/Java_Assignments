//8. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.

package com.sunbeam;

public class Clerk implements Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}
	public Clerk() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}

	@Override
	public double getSal() {
		
		return this.salary;
	}
	
 
}
