package com.app.fruits;

public class Orange extends Fruits {

	public Orange(String color, String name, double weigth, boolean isFresh) {
		super(color, name, weigth, isFresh);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "sour";
	}
	@Override
	public String toString() {
		return  super.toString();
	}

}