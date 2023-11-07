package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.subeam.Book;

public class Test {

	public static void main(String[] args) {
		Collection<Book> c=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add new book");
			System.out.println("2.Display all books");
			System.out.println("3. Delete book of given id");
			System.out.println("4. Check if book with given isbn");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books ");
			System.out.println("Enter your choice= ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you.... Visit Again....");
				System.exit(0);
				break;
			case 1:
				Book b = new Book();
				b.accept();
				c.add(b);
				System.out.println("Elements: "+c.toString());
				break;
			case 2:
				for(Book B:c)
					System.out.println(B);
				System.out.println("Elements: "+c.toString());
				
				break;
			case 3: //Scanner sc=new Scanner(System.in);
					System.out.println("Enter isbn to search= ");
					String isbn=sc.next();
					 Book key = new Book();
					 key.setIsbn(isbn);  
				if(c.contains(key))
					c.remove(key);
				System.out.println("Elements: "+c.toString());
				break;
			case 4:
				 System.out.println("Enter isbn to search= ");
				 isbn=sc.next();
				 Book key1 = new Book();
				 key1.setIsbn(isbn); 
					if(c.contains(key1))
						System.out.println("Book Found.....");
					else
						System.out.println("Sorry Book not Found....");
				break;
			case 5:
				c.clear();
				break;
			case 6:
				System.out.println("Size= "+c.size());
				break;

			default:
				System.out.println("Entered Wrong Choice......");
				break;
			}
			System.out.println("Thank you for Visiting our app");

		}while(true);
}
}