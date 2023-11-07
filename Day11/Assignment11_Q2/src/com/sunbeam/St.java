package com.sunbeam;

import java.util.Objects;

public class St implements Comparable<St> {	private int rollno;
	public String Name;
	public String City;
	public double Marks;

	public St() {
		// TODO Auto-generated constructor stub
	}

	public St(int rollno, String name, String city, double marks) {
		super();
		this.rollno = rollno;
		Name = name;
		City = city;
		Marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public double getMarks() {
		return Marks;
	}

	public void setMarks(double marks) {
		Marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(City, Marks, Name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		St other = (St) obj;
		return Objects.equals(City, other.City)
				&& Double.doubleToLongBits(Marks) == Double.doubleToLongBits(other.Marks)
				&& Objects.equals(Name, other.Name) && rollno == other.rollno;
	}
	
	public int compareTo(St other) {
		int diff;
		return -(Double.compare(this.Marks, other.Marks));
	}
	}


