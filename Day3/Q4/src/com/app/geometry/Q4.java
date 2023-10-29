package com.app.geometry;
import java.util.*;
public class Q4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.print("Enter number of points : ");
Point2D points[] = new Point2D[sc.nextInt()];
boolean exit = false;
int counter = 0;
do{
	System.out.println("--------Menu---------");
	System.out.println("1. Add point");
	System.out.println("2. Display Point");
	System.out.println("3. Display all points");
	System.out.println("4. Calculate Distance");
	System.out.println("5. Exit");
	System.out.println("---------------------");
	System.out.print("Enter choice : ");
	int choice = sc.nextInt();
	switch(choice){
		case 1:{
			System.out.print("Enter cordinates : ");
			points[counter++] = new Point2D(sc.nextInt(),sc.nextInt());
			System.out.println("Point Added!!!");
		}
		break;
		case 2:{
			System.out.print("Enter Index : ");
			int index = sc.nextInt();
			if(index >= 0 && index < counter)
			points[index].getDetails();
			else{
				System.out.println("Incorrect Index");
			}
		}
		break;
		case 3:{
			for(int i = 0;i < counter;i++){
				points[i].getDetails();
			}
		}
		break;
		case 4:{
			int x, y;
			System.out.print("Enter the Index of start point: ");
			x = sc.nextInt();
			System.out.print("Enter the Index of End point: ");
			y = sc.nextInt();
			if((x >= 0 && x < counter)&&(y >= 0 && y < counter)) {
				System.out.println("Distance between point "+x+"And point"+y+" : "+points[x].calDistance(points[y]));;
			}
			else
				System.out.println("Please enter indexs within range !!!"+0+"-"+(counter-1));
		}
		break;
		case 5:
			exit = true;
			break;
	}
}while(!exit);
}
}