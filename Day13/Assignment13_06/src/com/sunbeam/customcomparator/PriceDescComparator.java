package com.sunbeam.customcomparator;

import java.util.Comparator;

import com.sunbeam.Book;

public class PriceDescComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int diff = -Double.compare(b1.getPrice(), b2.getPrice());
		return diff;
	}

}
