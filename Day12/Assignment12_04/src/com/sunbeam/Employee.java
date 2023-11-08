package com.sunbeam;

public class Employee  implements Comparable<Employee>{
	String Name;
	int age;
	int id;
	double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, int id, double salary) {
		super();
		Name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if(o instanceof Employee) {
			Employee other = (Employee) o;
			if(this.id==other.id)
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Employee other) {
		
		return Integer.compare(this.id , other.id);
	}
	
	
}
