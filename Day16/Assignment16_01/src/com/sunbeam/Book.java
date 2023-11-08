
package com.sunbeam;

import java.util.Objects;

public class Book implements Comparable<Book>{

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}


	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if(o instanceof Book) {
			Book other = (Book) o;
			if(0==this.isbn.compareTo(other.isbn))
				return true;
		}
		return false;
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
	public int compareTo(Book other) {
		int diff = this.isbn.compareTo(other.isbn);
		return diff;
	}
	
	
}
