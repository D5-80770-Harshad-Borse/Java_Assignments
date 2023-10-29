package com.app.fruits;

public class Mango extends fruit{
	public Mango() {
		this.setName("Mango");
		super.setColour("Yellow");
	}
	public Mango(String colour,double weight, String name,boolean isfresh){
		super(colour,weight,name,isfresh);
	}
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
	}
	public String taste() {
		return "Sweet";
	}
}
