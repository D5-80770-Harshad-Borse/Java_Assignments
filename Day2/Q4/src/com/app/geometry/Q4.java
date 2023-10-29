package com.app.geometry;

public class Q4 {
public static void main(String[] args) {
	Point2D p1 = new Point2D(10,40);
	Point2D p2 = new Point2D(30,20);
	System.out.println("Is Equal :"+p1.isEqual(p2));
	System.out.println("Distance between p1 and p2 : "+p1.calDistance(p2));
	Point2D p3 = p2;
	System.out.println("Is Equal :"+p3.isEqual(p2));
	
}
}
