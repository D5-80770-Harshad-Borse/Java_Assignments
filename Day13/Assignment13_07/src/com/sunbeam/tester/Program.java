
package com.sunbeam.tester;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


import com.sunbeam.Student;




public class Program {

	public static int menu() {
		int choice=0;
		System.out.println("===========================================");
		System.out.println("Menu .......  ");
		System.out.println("0.Exit");
		System.out.println("1. Add new student.");
		System.out.println("2. Display all students");
		System.out.println("3. Search student");
		System.out.println("Enter Your Choice");
		choice = new Scanner(System.in).nextInt();
		return choice;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Student> students = new LinkedHashMap<>();
		int choice=0;
		
		do {
			choice = menu();
			switch (choice) {
			case 1:
				System.out.println("Case 1");
				Student student = new Student();
				System.out.println("Case 1");
				student.accept(sc);
				System.out.println("Case 1");
				students.put(student.getRollNo(),student);
				System.out.println("Case 1");
				break;
			case 2:
				Set< Entry<Integer,Student> > entries = students.entrySet();
				for(Entry<Integer,Student> en : entries) {
					System.out.println(en.getKey() + " -- " + en.getValue());
				}
				break;
			case 3 : 
				System.out.println("Enter Roll Number ");
				int rollNo = sc.nextInt();
				Student student1 = students.get(rollNo);
				System.out.println(student1);
				break;
			default :
				System.out.println("You Entered Wrong Choice");
				break;
			}
		}while(true);
		

		}
		

	}
