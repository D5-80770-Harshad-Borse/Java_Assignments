package com.sunbeam;


import java.util.EmptyStackException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		try {
		Employee [] emp = new Employee[1];
		
		System.out.println("Salesman = ");
		for(int i = 0; i<emp.length; i++)
		{
			emp[i] = new Salesman();
			emp[i].accpecData(new Scanner(System.in));
			
		}
		double sal = EmployeeHelper.averageSalesman(emp);
		System.out.println("Manager Salary = " + sal);
		
		for(Employee e: emp)
			System.out.println(e.toString());
		System.out.println();
		System.out.println("------------------------------------------------");
		
		
		System.out.println("Labour = ");
		for(int i = 0; i<emp.length; i++)
		{
			emp[i] = new Labour();
			emp[i].accpecData(new Scanner(System.in));
			
		}
		double sal1 = EmployeeHelper.averageSalManagers(emp);
		System.out.println("Labour Salary = " + sal1);
		
		for(Employee e: emp)
			System.out.println(e.toString());
		System.out.println();

		System.out.println("------------------------------------------------");
		
		System.out.println("Cleark = ");
		for(int i = 0; i<emp.length; i++)
		{
			emp[i] = new Clerk();
			emp[i].accpecData(new Scanner(System.in));
			
		}
		double sal2 = EmployeeHelper.averageClerks(emp);
		System.out.println("Cleark Salary = " + sal2);
		
		for(Employee e: emp)
			System.out.println(e.toString());
		}
		
		catch(EmptyStackException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}