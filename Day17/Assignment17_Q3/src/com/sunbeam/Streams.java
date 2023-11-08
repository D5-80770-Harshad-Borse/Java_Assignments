package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) {
		IntSummaryStatistics result=IntStream.rangeClosed(1, 10)
				.summaryStatistics();
		long sum = result.getSum();
		System.out.println(result);
		System.out.println("Sum is= "+sum);

	}

}
