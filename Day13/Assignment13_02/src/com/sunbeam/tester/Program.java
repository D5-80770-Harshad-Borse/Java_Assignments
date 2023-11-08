//Store few books (hardcoded values with the Book class in previous assignment -- with equals() and without Comparable) in a HashSet and display them
//using iterator. If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

package com.sunbeam.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sunbeam.Book;

public class Program {

	public static void main(String[] args) {
		Set<Book> books = new HashSet<>();
		books.add(new Book("1",200,"Vishal",2));
		books.add(new Book("4",500,"kshitij",2));
		books.add(new Book("3",1000,"Rushi",4));
		books.add(new Book("2",200,"Prathamesh",3));
		books.add(new Book("5",250,"Aadesh",5));
		books.add(new Book("3",1500,"Rushi",4));
		
		Iterator<Book>itr = books.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		

	}

}
