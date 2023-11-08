package com.sunbeam.tester;


import java.util.PriorityQueue;
import java.util.Queue;

import com.sunbeam.Employee;
import com.sunbeam.customcomparator.SalaryDescComparator;

public class Program {

	public static void main(String[] args) {
		Queue<Employee>employees = new PriorityQueue<Employee>(new SalaryDescComparator());
		employees.offer(new  Employee("Rushi",25,1,100000));
		employees.offer(new  Employee("Swarnim",25,2,10000));
		employees.offer(new  Employee("Sandesh",25,3,102000));
		employees.offer(new  Employee("Adesh",25,4,103000));
		employees.offer(new  Employee("Harshad",25,5,100000));
		employees.offer(new  Employee("Rutvik",25,6,105000));
		
		while(!employees.isEmpty()) {
			Employee emp = employees.poll();
			System.out.println("Popped: " + emp);
		}

	}

}
