package com.app.geometry;
import java.util.*;
class Point2D {
private int x;
private int y;
public Point2D(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public void getDetails() {
	System.out.println(this);
}
public String toString() {
	return ("Cordinates   X : "+" "+x+"Y : "+y);
}
public boolean isEqual(Point2D ref) {
	if(this.x == ref.x && this.y == ref.y) {
		return true;
	}
	else
		return false;
}
public double calDistance(Point2D ref) {
	return (Math.sqrt(Math.pow((ref.x - this.x), 2)+Math.pow((ref.y - this.y), 2)));
}
public static double calDistance(Point2D ref1,Point2D ref2) {
	return (Math.sqrt(Math.pow((ref1.x - ref2.x), 2)+Math.pow((ref1.y - ref2.y), 2)));
}
}

