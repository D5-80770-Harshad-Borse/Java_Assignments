package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>(); //Allows Multiple Null Values
		//Collection<String> c = new HashSet<>();   //Allows Single Null Value
		//Collection<String> c = new LinkedHashSet<>(); //Allows Single Null Value
		Collection<String> c = new TreeSet<>(); // Dont Allows Null Values
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
