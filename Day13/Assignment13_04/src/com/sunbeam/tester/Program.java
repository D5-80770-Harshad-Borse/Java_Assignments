

package com.sunbeam.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.Book;

public class Program {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<>();
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
