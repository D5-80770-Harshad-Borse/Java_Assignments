package com.sunbeam.customcomparator;

import java.util.Comparator;

import com.sunbeam.Employee;

public class SalaryDescComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = -Double.compare(e1.getSalary(), e2.getSalary());
		return diff;
	}

		
}