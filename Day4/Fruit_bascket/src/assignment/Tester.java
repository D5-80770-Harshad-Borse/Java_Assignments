package assignment;
import java.util.*;

public class Tester {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Object arr1[] = new Object[5];
	double rev[] = new double[100]; 
	int counter = 0;
	int counter2 = 0;
	boolean Exit = false;
	do {
		int choice  = 0;
		System.out.println("-----Menu------");
		System.out.println("1. Add Product");
		System.out.println("2. Generate Bill");
		System.out.println("3. Show Revenue");
		System.out.println("----------------");
		System.out.print("Enter Choice : ");
		choice = sc.nextInt();
		switch(choice){
		case 1:{
			int choice1 = 0;
			boolean flag  = false;
			if(counter % 3 == 0)
				System.out.println("Your Eligible for Discount!!!!!!");
			
			System.out.println("------Products-------");
			System.out.println("1. Book");
			System.out.println("2. Album");
			System.out.println("3. Toy");
			System.out.println("4. Back to Menu");
			System.out.println("---------------------");
			
			do {
				System.out.print("Select Product: ");
				choice1 = sc.nextInt();
				switch(choice1) {
				case 1:{
					if(counter <= 5) {
						arr1[counter] = new Book();
						Book ref = (Book)arr1[counter];
						ref.acceptData();
						System.out.println("Book Added!!!");
						counter++;
					}
					else 
						System.out.println("Basket Full!!!");
				}
				break;
				case 2: {
					if(counter <= 5) {
						arr1[counter] = new Album();
						Album ref = (Album)arr1[counter];
						ref.acceptData();
						System.out.println("Album Added!!!");
					}
					else
						System.out.println("Basket Full");
				}
				break;
				case 3: {
					if(counter <= 5) {
						arr1[counter] = new Toy();
						Toy ref = (Toy)arr1[counter];
						ref.acceptData();
						System.out.println("Toy Added!!!");
						counter++;
					}
					else
						System.out.println("Basket Full!!!!");
				}
				break;
				case 4:{
					flag = true;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
				}
				break;
				}
			}while(!flag);
		}
		break;
		case 2:{
			double total = 0;
			double total1 = 0;
			int arr2[] = new int[3];
			for(int i = 0; i < counter;i++) {
				if(arr1[i] instanceof Book) {
					arr2[0]++;
				}
				else if(arr1[i] instanceof Album){
					arr2[1]++;
				}
				else if(arr1[i] instanceof Toy){
					arr2[2]++;
				}
			}
			
			System.out.println("----------INVOICE-----------");
			for(int i = 0; i < counter;i++) {
				if(arr1[i] instanceof Book) {
					Book ref = (Book)arr1[i];
					ref.display();
					total = total + ref.getPrice();
				}
				else if(arr1[i] instanceof Album){
					Album ref = (Album)arr1[i];
					ref.display();
					if(counter % 3 == 0) {
					total = total + (ref.getPrice()- ref.getPrice()*ref.getDiscount())+(ref.getPrice()*ref.getTax_GST());
					total1 = ref.getPrice()- ref.getPrice()*ref.getDiscount();
					}
					else {
						total = total + ref.getPrice()+(ref.getPrice()*ref.getTax_GST());
						total1 = total1 + ref.getPrice();
					}
					}
				else if(arr1[i] instanceof Toy){
					Toy ref = (Toy)arr1[i];
					ref.display();
					
					if(counter % 3 == 0) {
					total = total + (ref.getPrice()- ref.getPrice()*ref.getDiscount())+(ref.getPrice()*ref.getTax_VAT());
					total1 = ref.getPrice()- ref.getPrice()*ref.getDiscount();
					}
					else {
						total = total + ref.getPrice()+(ref.getPrice()*ref.getTax_VAT());
						total1 = total1 + ref.getPrice();
					}
				}
			}
			System.out.println("------------------------------");
			if(counter % 3 == 0) {
			System.out.println("Discount Applied !!!!!");
			}
			System.out.println("Books :      Qty x"+arr2[0]);
			System.out.println("Album :      Qty x"+arr2[1]+"  "+"GST 10%");
			System.out.println("Toy   :      Qty x"+arr2[2]+"  "+"VAT 5%");
			System.out.println("------------------------------");
			System.out.println("Total :                    "+total);
			rev[counter2++]= total1;
			
		}
		break;
		case 3:{
			double revenue = 0;
			for(int i = 0; i < counter2;i++) {
				revenue = revenue + rev[i];
			}
			System.out.println("Total revenue: "+revenue);
			Exit  = true;
		}
		break;
		}
		
	}while(!Exit);
}
}
