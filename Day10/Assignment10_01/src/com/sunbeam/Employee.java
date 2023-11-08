package com.sunbeam;

public abstract class Employee extends Person {


	private int id;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

}
