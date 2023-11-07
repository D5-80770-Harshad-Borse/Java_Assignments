package com.subeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	String isbn;
	double price;
	String authorName; 
	int quantity;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Object Books;
		if (obj instanceof Book) {
			Book b1=(Book)obj;
		if(0==this.isbn.compareTo(b1.isbn));
		return true;
		}
		return false;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the isbn");
		isbn = sc.next();
		
		System.out.println("Enter the price");
		price = sc.nextDouble();
		
		System.out.println("Enter the authorName");
		authorName = sc.next();
		
		System.out.println("Enter the isbn");
		isbn = sc.next();
		
	}
	
	

}