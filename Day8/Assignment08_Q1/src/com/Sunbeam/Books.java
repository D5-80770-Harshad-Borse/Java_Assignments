package com.Sunbeam;

import java.util.Scanner;

public class Books extends Shop {
	int ISBN;
	
	String author;
	String subject;
	
	
	
	public Books() {
		
	}
	public Books(int iSBN, String author, String subject) {
		super();
		ISBN = iSBN;
		
		this.author = author;
		this.subject = subject;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", author=" + author + ", subject=" + subject + "]";
	}
	public void Accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter title= ");
		title=sc.next();
		System.out.println("Enter ISBN=");
		ISBN=sc.nextInt();
		System.out.println("Enter Author= ");
		author=sc.next();
		System.out.println("Enter subject= ");
		subject=sc.next();
		System.out.println("Enter Price= ");
		super.price=sc.nextDouble();
	}
	
	

}

