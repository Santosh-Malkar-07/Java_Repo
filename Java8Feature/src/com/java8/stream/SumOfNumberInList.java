package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		
		int result = list.stream().mapToInt(Integer::intValue).sum();
		int result1 = list.stream().mapToInt(data -> data).sum();
		System.out.println(result);
		System.out.println(result1);

	}

}
