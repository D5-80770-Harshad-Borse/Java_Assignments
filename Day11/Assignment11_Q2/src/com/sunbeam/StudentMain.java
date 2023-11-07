package com.sunbeam;

import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		{

			Student[] arr1 = { 
					new Student(1, "Sandesh", "Sangli", 78.45), 
					new Student(2, "Sanket", "Sangli", 88.45),
					new Student(3, "Swarnim", "Kolhapur", 98.45), 
					new Student(4, "Prathamesh", "Tasgoan", 58.45),
					new Student(5, "Kshitij", "Satara", 68.45), 
					};
			System.out.println("Before Sort: ");
			for (Student student : arr1)
				System.out.println(student);
			Arrays.sort(arr1);

			System.out.println("AfterSort: ");
			for (Student student : arr1)
				System.out.println(student);
		}

	}
}
