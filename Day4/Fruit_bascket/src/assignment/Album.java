package assignment;
import java.util.*;
public class Album {
	private String title;
	private String musician;
	private double price;
	private String singer;
	private static double tax_GST =  0.1;
	Album(){
	}
	Album(String title,String musician, double price,String singer){
		this.title = title;
		this.musician = musician;
		this.price = price;
		this.singer = singer;
	}
	void acceptData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title : ");
		this.title = sc.next();
		System.out.print("Enter musician : ");
		this.musician = sc.next();
		System.out.print("Enter singer :  ");
		this.singer = sc.next();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
		}
	public static double getTax_GST() {
		return tax_GST;
	}
	public static double getDiscount() {
		return tax_GST;
	}
	void display() {
		System.out.println("----Album-----");
		System.out.println("title : "+this.title);
		System.out.println("musician : "+this.musician);
		System.out.println("singer : "+this.singer);
		System.out.println("price : "+this.price);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getmusician() {
		return musician;
	}
	public void setmusician(String musician) {
		this.musician = musician;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getsinger() {
		return singer;
	}
	public void setsinger(String singer) {
		this.singer = singer;
	}
	
}


