package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		Collections.addAll(strings, "abcd","abcde","dsdsdsadsd","dghsrth","dfjkbdfg");
		System.out.println("Longest String In List is : "+Collections.max(strings));

	}

}
