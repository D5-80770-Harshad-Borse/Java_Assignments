package com.sunbeam.tester;

import com.sunbeam.Clark;
import com.sunbeam.Employee;
import com.sunbeam.GenericBox;
import com.sunbeam.Labour;

public class Program {
	public static void main(String[] args) {
		GenericBox<Employee>gb=new GenericBox<Employee>();
		gb.set(new Labour(1,100,5,100));
		System.out.println("Salary Of An Employee  : "+gb.get().calSalary());
		GenericBox<Employee>gb1=new GenericBox<Employee>();
		gb1.set(new Clark(1,1000));
		System.out.println("Salary Of An Employee  : "+gb1.get().calSalary());
		
	}
}
