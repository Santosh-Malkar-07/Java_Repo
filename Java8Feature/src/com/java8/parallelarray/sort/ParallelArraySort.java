package com.java8.parallelarray.sort;

import java.util.Arrays;

public class ParallelArraySort {

	public static void main(String[] args) {
		int[] arrs = { 5, 8, 1, 0, 6, 9, -3 };
//		Arrays.sort(arrs);

//		Arrays.parallelSort(arrs);
//		Arrays.parallelSort(arrs, 0, 4);

		for (int arr : arrs) {
			System.out.println(arr);
		}
	}

}
