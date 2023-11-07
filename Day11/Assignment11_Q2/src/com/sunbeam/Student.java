package com.sunbeam;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollno;
	public String Name;
	public String City;
	public double Marks;

	public Student() {
// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String city, double marks) {
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
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + ", City=" + City + ", Marks=" + Marks + "]";
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
		Student other = (Student) obj;
		return Objects.equals(City, other.City)
				&& Double.doubleToLongBits(Marks) == Double.doubleToLongBits(other.Marks)
				&& Objects.equals(Name, other.Name) && rollno == other.rollno;
	}

	@Override
	public int compareTo(Student other) {
//1st level city in desc
// int diff= - this.City.compareTo(other.City) ;
// return diff;
//2nd level marks in desc
		int diff;
		return -(Double.compare(this.Marks, other.Marks));

//3rd level Name in asc
// int diff= this.Name.compareTo(other.Name) ;
// return diff;
	}

}