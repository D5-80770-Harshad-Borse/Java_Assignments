//Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//functionality:

package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Employee;

public class Program {
	public static int menu() {
		int choice = 0;
		System.out.println("===========================================");
		System.out.println("Menu .......  ");
		System.out.println("0.Exit");
		System.out.println("1. Add new Employee in list.");
		System.out.println("2. Delete Employee");
		System.out.println("3. Search a Employee");
		System.out.println("4. Sort Employees");
		System.out.println("5. Edit Employee Information");
		System.out.println("6 Display Employees");
		System.out.println("Enter Your Choice");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		List<Employee> employees= new ArrayList<>();
		do {
			switch (choice) {
			case 1:
			System.out.println("Enter Employee Id");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Age");
			int age = sc.nextInt();
			System.out.println("Enter Employee Salary");
			double salary= sc.nextDouble();
			Employee employee = new Employee(name,age,id,salary);
			employees.add(employee);
				break;
			case 2:
				System.out.println("Enter Employee ID To Be Deleted");
				id = sc.nextInt();
				employee = new Employee();
				employee.setId(id);
				employees.remove(employee);
				break;
			case 3 : 
				System.out.println("Enter Employee Id ");
				id = sc.nextInt();
				employee = new Employee();
				employee.setId(id);
				int index = employees.indexOf(employee);
				System.out.println("Employee Details ");
				System.out.println(employees.get(index));
				break;
			case 4 :
				Collections.sort(employees);
				break;
			case 5:
				System.out.println("Enter Employee Id ");
				id = sc.nextInt();
				employee = new Employee();
				employee.setId(id);
				index = employees.indexOf(employee);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = employees.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				System.out.println("Enter Employee Name");
				name = sc.next();
				System.out.println("Enter Employee Age");
				age = sc.nextInt();
				System.out.println("Enter Employee Salary");
				salary= sc.nextDouble();
				employee = new Employee(name,age,id,salary);
				employees.set(index, employee);
				}
				break;
			case 6 :
				for(Employee emp : employees)
					System.out.println(emp);
				break;
			default :
				System.out.println("You Entered Wrong Choice");
				break;
			}
		}while((choice=menu())!=0);

	}
}
