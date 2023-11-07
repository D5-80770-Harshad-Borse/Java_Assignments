package com.Sunbeam;

import java.util.Scanner;

public class Shop {
	String title;
	double price;
	public Shop(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shop [title=" + title + ", price=" + price + "]";
	}


}
