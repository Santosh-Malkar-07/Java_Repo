package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startwith {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Santosh", "Nriyanka", "Rani", "Nitin", "Sneha", "Nanjal");
		List<String> result1 = list.stream().filter(data -> data.startsWith("N")).collect(Collectors.toList());
		System.out.println("result1 : " + result1);

		String s1 = "hello santosh malkar";
		

	}

}
