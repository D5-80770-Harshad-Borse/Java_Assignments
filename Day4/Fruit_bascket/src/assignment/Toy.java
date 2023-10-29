package assignment;
import java.util.*;
public class Toy {

	private String title;
	private String age_group;
	private double price;
	private String type;
	private static double tax_VAT = 0.05;
	
	Toy(){
	}
	Toy(String title,String age_group, double price,String type){
		this.title = title;
		this.age_group = age_group;
		this.price = price;
		this.type = type;
	}
	void acceptData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title : ");
		this.title = sc.next();
		System.out.print("Enter age_group : ");
		this.age_group = sc.next();
		System.out.print("Enter type :  ");
		this.type = sc.next();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
		}
	void display() {
		System.out.println("----Toy-----");
		System.out.println("title : "+this.title);
		System.out.println("age_group : "+this.age_group);
		System.out.println("type : "+this.type);
		System.out.println("price : "+this.price);
	}
	public static double getTax_VAT(){
		return tax_VAT;
	}
	public static double getDiscount(){
		return tax_VAT;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getage_group() {
		return age_group;
	}
	public void setage_group(String age_group) {
		this.age_group = age_group;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	
}


