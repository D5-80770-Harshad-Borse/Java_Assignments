package com.sunbeam;

public class GenericBox <T extends Employee>{

	
		private T obj;
		
		public void set(T obj) {
			this.obj = obj;
		}
		public T get() {
			return this.obj;
		
	}
		public double TotalSalary() {
			return this.get().calSalary();
		}
}
