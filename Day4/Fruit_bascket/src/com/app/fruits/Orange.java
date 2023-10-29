package com.app.fruits;

public class Orange extends fruit {
	public Orange(){
		super.setName("Orange");
		super.setColour("Orange");
	}
	public Orange(String colour,double weight, String name,boolean isfresh){
		super(colour,weight,name,isfresh);
	}
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
	}
	public String taste() {
		return "sour";
	}
}
