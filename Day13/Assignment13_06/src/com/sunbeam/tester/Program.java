//6. Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() in Book
//class? Hint:
//// declare map: key=isbn, value=Book object
//Map<String,Book> map = new HashMap<>();
//// case 1: insert in map
//Book b = new Book();
//// accept book from user
//map.put(b.getIsbn(), b);
//// case 2: find in map
//String isbn = sc.next();
//Book f = map.get(isbn);



package com.sunbeam.tester;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.Book;
import com.sunbeam.customcomparator.PriceDescComparator;

public class Program {

	public static int menu() {
		int choice=0;
		System.out.println("===========================================");
		System.out.println("Menu .......  ");
		System.out.println("0.Exit");
		System.out.println("1. Add new book in Map.");
		System.out.println("2. Display all books");
		System.out.println("3. Search Book");
		System.out.println("Enter Your Choice");
		choice = new Scanner(System.in).nextInt();
		return choice;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Book> books = new HashMap<>();
		int choice=0;
		
		do {
			choice = menu();
			switch (choice) {
			case 1:
				Book b =new Book();
				b.accept(sc);
				books.put(b.getIsbn(),b);
				break;
			case 2:
				Set< Entry<String,Book> > entries = books.entrySet();
				for(Entry<String,Book> en : entries) {
					System.out.println(en.getKey() + " -- " + en.getValue());
				}
				break;
			case 3 : 
				System.out.println("Enter Isbn Of Book ");
				String s1 = sc.next();
				Book b1 = books.get(s1);
				System.out.println(b1);
				break;
			default :
				System.out.println("You Entered Wrong Choice");
				break;
			}
		}while(true);
		

		}
		

	}


