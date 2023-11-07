package EmployeeSalary;

import java.util.Scanner;

public class testerEmployee {

	public static int menu() {
		int choice;
		System.out.println("0 : Exit");
		System.out.println("1 : Add Salaried Employee");
		System.out.println("2 : Add Hourly Employee");
		System.out.println("3 : Add Commission Employee");
		System.out.println("4 : Add Base Plus Commission Employee");
		System.out.println("5 : Display Specific Employee Salary");
		System.out.println("6 : Display All Employee Salary");

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter your choice = ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		int choice;
		Employee employees[] = new Employee[size];
		int idx = 0;

		while (idx < size) {
			choice = menu();

			switch (choice) {
			case 0:
				System.out.println("Thank You!");
				break;
			case 1: 
				
				employees[idx] = new salariedEmployee();
				employees[idx].inputData(sc);
				employees[idx++].addBonus(10);
				break;
			case 2: 
				
				employees[idx] = new hourlyEmployee();
				employees[idx++].inputData(sc);
				break;
			case 3: 
				
				employees[idx] = new commissionEmployee();
				employees[idx].inputData(sc);
				employees[idx++].addBonus(10);
				break;
			case 4: 
				
				employees[idx] = new baseCommissionEmployee();
				employees[idx].inputData(sc);
				employees[idx++].addBonus(10);
				break;
			case 5: 
				
				System.out.println("Enter the index");
				int i = sc.nextInt();
				if (i < idx) {
					System.out.println(employees[i].getClass() + " " + employees[i].totalSalary());
				} else
					System.err.println("Invalid index");
				break;
			case 6: 
				
				for (int j = 0; j < idx; j++) {
					System.out.println(employees[j].getClass() + " " + employees[j].totalSalary());
				}
				break;
			default:
				System.err.println("Invalid Choice");
				break;
			}
		}

	}

}