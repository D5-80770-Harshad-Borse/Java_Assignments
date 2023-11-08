package com.sunbeam;

public class Clark extends Employee {

	public Clark(int id,double salary) {
		super(id,salary);
	}
	@Override
	public double calSalary() {
		
		return this.getSalary();
	}

}
