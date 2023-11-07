package com.sunbeam;

public class EmployeeException extends RuntimeException {
	String field;
	double values;
	
	public EmployeeException(String field, double values) {
		super("Invalid" + field + "-"+values);
		this.field = field;
		this.values = values;
	}
	
	public EmployeeException()
	{
		super("Invalid Value");
		
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public double getValues() {
		return values;
	}

	public void setValues(double values) {
		this.values = values;
	}
	
	
	
	

}