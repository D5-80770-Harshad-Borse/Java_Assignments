package assignment;
import java.util.*;
public class Book {
	private String ISBN;
	private String title;
	private String subject;
	private double price;
	private String auther;
	private static int tax = 0;
	Book(){
	}
	Book(String ISBN, String title,String subject, double price,String auther){
		this.ISBN = ISBN;
		this.title = title;
		this.subject = subject;
		this.price = price;
		this.auther = auther;
	}
	void acceptData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN : ");
		this.ISBN = sc.next();
		System.out.print("Enter title : ");
		this.title = sc.next();
		System.out.print("Enter subject : ");
		this.subject = sc.next();
		System.out.print("Enter Auther :  ");
		this.auther = sc.next();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
		}
	void display() {
		System.out.println("----Book-----");
		System.out.println("ISBN  :"+this.ISBN);
		System.out.println("title : "+this.title);
		System.out.println("Subject : "+this.subject);
		System.out.println("Auther : "+this.auther);
		System.out.println("price : "+this.price);
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
}

