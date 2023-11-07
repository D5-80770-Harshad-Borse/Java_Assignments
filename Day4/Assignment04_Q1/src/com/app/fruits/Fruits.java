package com.app.fruits;

public class Fruits {
	String color;
	String name;
	double weigth;
	boolean isFresh;

	public Fruits(String color, String name, double weigth, boolean isFresh) {
		super();
		this.color = color;
		this.name = name;
		this.weigth = weigth;
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", name=" + name + ", weigth=" + weigth + ", isFresh=" + isFresh + "]";
	}

	public String test() {
		return "no specific taste";
	}
}