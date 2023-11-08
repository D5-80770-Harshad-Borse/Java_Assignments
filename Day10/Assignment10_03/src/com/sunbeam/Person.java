package com.sunbeam;



	public class Person implements Displayable {
		private String name;
		private int age;
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		// ...
		@Override
		public void display() {
			System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
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
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		@Override
		public Displayable get() {
			// TODO Auto-generated method stub
			return this;
		}
	
		
}
