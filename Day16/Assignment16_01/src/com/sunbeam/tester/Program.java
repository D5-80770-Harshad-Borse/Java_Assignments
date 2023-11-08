//1. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven program to
//1. Add new book in List
//If book not present, then add a new book (hint - indexOf())
//If book is present, sum its quantity i.e. new quantity = existing quantity + input quantity
//2. Display all books in forward order using random access
//3. Search a book with given isbn (hint - indexOf())
//4. Delete a book at given index.
//5. Delete a book with given isbn.
//6. Delete a book with given name.
//7. Sort books by isbn in asc order -- Collections.sort(list);
//8. Sort books by price in desc order -- Collections.sort(list, comparator);
//9. Reverse the list -- Collections.reverse(list);


package com.sunbeam.tester;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;
import com.sunbeam.customcomparator.PriceDescComparator;

public class Program {
	public static int menu() {
		int choice=0;
		System.out.println("===========================================");
		System.out.println("Menu .......  ");
		System.out.println("0.Exit");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Delete a book with given Author Name");
		System.out.println("7. Sort books by isbn in asc order");
		System.out.println("8. Sort books by price in desc order");
		System.out.println("9. Reverse the list");
		System.out.println("10. Save Books In File");
		System.out.println("11. Read Books From File");
		System.out.println("Enter Your Choice");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		List<Book> books= new ArrayList<>();
		do {
			switch (choice) {
			case 1:
				System.out.println("Enter ISBN of Book");
				String isbn  = sc.next();
				System.out.println("Enter Price of Book");
				double price  = sc.nextDouble();
				System.out.println("Enter Author Name of Book");
				String aName  = sc.next();
				System.out.println("Enter Quantity of Book");
				int qty  = sc.nextInt();
				Book b =new Book(isbn,price,aName,qty);
				int index = books.indexOf(b);
				if(index==-1)
				{
					books.add(b);
				}
				else {
					Book other =books.get(index);
					other.setQuantity(other.getQuantity()+b.getQuantity());
				}
				break;
			case 2:
				for(index = 0; index<books.size();index++) {
					System.out.println(books.get(index));
				}
				break;
			case 3 : 
				System.out.println("Enter Isbn Of Book ");
				String s1 = sc.next();
				Book b1 = new Book();
				b1.setIsbn(s1);
				//System.out.println(b.getIsbn());
				index =books.indexOf(b1);
				if(index ==-1)
				{
					System.out.println("Book Not Found");
				}
				else {
				System.out.println(books.get(index));
				}
				break;
			case 4 :
				System.out.println("Enter index Of Book To Be Searched");
				index = sc.nextInt();
				books.remove(index);
				System.out.println("Book From Index "+index +" Has Been Removed");
				break;
			case 5:
				System.out.println("Enter Isbn Of Book ");
				s1 = sc.next();
				b1 = new Book();
				b1.setIsbn(s1);
				//System.out.println(b.getIsbn());
				index =books.indexOf(b1);
				if(index ==-1)
				{
					System.out.println("Book Not Found");
				}
				else {
				System.out.println(books.remove(index));
				}
				break;
			case 6 :
				System.out.println("Enter Author Name Whose Book Is To Be Deleted");
				s1 =sc.next();
//				Iterator<Book> itr = books.iterator();
//				while(itr.hasNext()) {
//					b = itr.next();
//					if(0==b.getAuthorName().compareTo(s1)) {
////						index = books.indexOf(b);
////						books.remove(index);
//						itr.remove();
//						
//					}
//					
//				} 
				//        OR
				for(index =0;index<books.size();index++) {
					System.out.println("size :"+books.size());
				if(0==books.get(index).getAuthorName().compareTo(s1))
				{
					books.remove(index);
					System.out.println("Removed Index : "+index);
					index--;
				}
				}
				break;
			case 7 :
				Collections.sort(books);
				break;
			case 8 :
				books.sort(new PriceDescComparator());
				break;
			case 9 :
				Collections.reverse(books);
				break;
			case 10:
				writeInFile(books);
				break;
			case 11:
				readFromFile();
				break;
			default :
				System.out.println("You Entered Wrong Choice");
			}
		}while((choice=menu())!=0);

	}

	private static void readFromFile() {
		List<Book> list = new ArrayList<Book>();
		try(FileInputStream fin = new FileInputStream("Books.bin")) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					Book book = new Book();
					book.setIsbn(din.readUTF());
					book.setPrice(din.readDouble());
					book.setAuthorName(din.readUTF());
					book.setQuantity(din.readInt());
					list.add(book);
				}
			} // din.close();
		} // fin.close();
		catch (EOFException e) {
			// do nothing -- close() is done auto -- AutoCloseable
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		list.forEach(e -> System.out.println(e));
		
	}

	private static void writeInFile(List<Book> books) {
		try(FileOutputStream fout = new FileOutputStream("Books.bin")) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for (Book book : books) {
					dout.writeUTF(book.getIsbn());
					dout.writeDouble(book.getPrice());
					dout.writeUTF(book.getAuthorName());
					dout.writeInt(book.getQuantity());
				}
				System.out.println("Books saved: " + books.size());
			} // dout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	}

