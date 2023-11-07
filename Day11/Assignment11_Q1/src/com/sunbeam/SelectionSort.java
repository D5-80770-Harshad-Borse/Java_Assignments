package com.sunbeam;

import java.util.Comparator;

public class SelectionSort {
   
    private static class DoubleComparator implements Comparator<Double> {
     
        public int compare(Double a, Double b) {
            return a.compareTo(b);
        }
    }

    public static <T> void selectionSort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Double[] arr1 = new Double[] { 21.25, 18.03, 7.55, 50.43 };

        selectionSort(arr1, new DoubleComparator());

        for (Double ele : arr1) {
            System.out.println(ele);
        }
    }
}
