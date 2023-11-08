package com.sunbeam.tester;

import com.sunbeam.Box;
import com.sunbeam.*;

public class Program {
	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.get().display();
		}
	
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
		}


	public static void main(String[] args) {
		Box<Displayable>b = new Box<Displayable>();
		b.set(new Book("Panipat",1000));
		printDisplayableBox(b);
		printAnyBox(b);
		
		Box<Car>c=new Box<Car>();
		c.set(new Car("Nexon",1200000));
		//printDisplayableBox(c);
		printAnyBox(c);
		
		

	}

}
