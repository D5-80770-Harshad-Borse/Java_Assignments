package com.app.fruits;

public class Apple extends fruit
{
	public Apple(){
		super.setName("Apple");
		super.setColour("Red");
	}
	public Apple(String colour,double weight, String name,boolean isfresh){
		super(colour,weight,name,isfresh);
	}
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
	}
	public String taste() {
		return "Sweet and sour";
	}
}
