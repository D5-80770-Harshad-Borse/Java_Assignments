package com.sunbeam;

public class Labour extends Employee {

	private int hours;
	private int rate;
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Labour(int id, double salary, int hours, int rate) {
		super(id, salary);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return this.hours*this.rate;
	}

}
