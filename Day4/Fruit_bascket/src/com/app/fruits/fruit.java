package com.app.fruits;
import java.util.*;
public class fruit {
private String colour;
private double weight;
private String name;
private boolean isfresh;

public fruit() {
}
public fruit(String colour,double weight, String name,boolean isfresh) {
	this.colour = colour;
	this.weight = weight;
	this.name = name;
	this.isfresh = isfresh;
}
 public void accept() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter weight: ");
	 this.weight = sc.nextDouble();
	 System.out.print("IsFresh ?: ");
	 this.isfresh = sc.nextBoolean(); 
 }
 public void display() {
	 System.out.println("Name : "+this.name);
	 System.out.println("Colour : "+this.colour);
	 System.out.println("Weight : "+this.weight);
	 System.out.println("isfresh : "+this.isfresh);
 }
 public String taste() {
	 return "No Specific Taste";
 }
 public void setName(String name){
	 this.name = name;
 }
 public void setColour(String Colour){
	 this.colour = colour;
 }
 public String getname() {
	 return this.name;
 }
 public void setIsfresh(boolean isfresh) {
	this.isfresh = isfresh;
}
public boolean getIsFresh(){
	 return this.isfresh;
 }
 
}
