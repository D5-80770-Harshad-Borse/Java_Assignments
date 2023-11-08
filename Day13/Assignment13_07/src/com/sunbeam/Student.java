//7. Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. Do we need to write equals() and
//hashCode() in Student class? Follow menu-driven approach. Hint:
//class Student {
//// ...
//}
//Map<Integer, Student> map = new HashMap<>();
//s = new Student();
//acceptStudent(s); // implement method in Main class
//map.put(s.getRoll(), s);
//roll = sc.nextInt();
//s = map.get(roll);

package com.sunbeam;

import java.util.Scanner;

public class Student {

	private int rollNo;
	private String name;
	private int age;
	private double marks;
	
	public void accept(Scanner sc) {
		System.out.println("Enter Roll Number");
		this.setRollNo(sc.nextInt());
		System.out.println("Enter Name of Student");
		this.setName(sc.next());
		System.out.println("Enter Age Of Student");
		this.setAge(sc.nextInt());
		System.out.println("Enter Marks Of Student");
		this.setMarks(sc.nextDouble());
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int age, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
}
