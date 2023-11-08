package com.sunbeam.tester;

import com.sunbeam.GenericMethod;

public class Program {

	public static void main(String[] args) {
		Double[] arr2 = new Double[] { 1.1, 2.2, 3.3, 4.4 };
		System.out.println("Smallest Number In Array is : "+GenericMethod.findMinimum(arr2)); //generic type is inferred = Double
		
		Integer[] arr3 = new Integer[] { 11, 22, 33, 44 };
		System.out.println("Smallest Number In Array is : "+GenericMethod.findMinimum(arr3));

	}

}
