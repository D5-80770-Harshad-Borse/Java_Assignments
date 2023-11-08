package com.sunbeam;
public class GenericMethod {
	public static <N extends Number> Number findMinimum( Number []arr) {
		Number n1 = arr[0];
		for(Number ele:arr)
		{
			if(n1.doubleValue()>ele.doubleValue()) {
				n1=ele;
			}
		}
		return n1;
	}
	
}
