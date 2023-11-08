//8. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
//simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
//inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
//otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
//not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
//total income (salary + incentives) of all employees in the given array.


package com.sunbeam.tester;

import com.sunbeam.Clerk;
import com.sunbeam.Employee;
import com.sunbeam.Labor;
import com.sunbeam.Manager;

public class Program {

	public static void main(String[] args) {
		Employee []employees =new Employee[10];
		
		employees[0]=new Manager(100000,10000);
		employees[1]=new Manager(80000,10000);
		employees[2]=new Manager(90000,5000);
		employees[3]=new Manager(50000,8000);
		employees[4]=new Clerk(100000);
		employees[5]=new Clerk(90000);
		employees[6]=new Clerk(80000);
		employees[7]=new Labor(200,200);
		employees[8]=new Labor(300,200);
		employees[9]=new Labor(350,200);
		
		double totalSalary = Employee.calcTotalIncome(employees);
		System.out.println("Total Salaries of all Employees : "+totalSalary);
		
	}

}
