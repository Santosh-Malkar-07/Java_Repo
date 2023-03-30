package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Santosh");
		list.add("Malkar");
		list.add("Nitin");
		list.add("Santosh");
		list.add("Rani");
		list.add("Malkar");
		list.add("Priyanka");

		List<String> listResult = list.stream().distinct().collect(Collectors.toList());
		System.out.println(listResult);

	}

}
