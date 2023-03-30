package com.java8.functional.interface1;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {

		Predicate<Integer> isGreater = (num) -> {
			return num > 10;
		};

		System.out.println(isGreater.test(1));
		
		Function<String, Integer> strLength = (s) -> {
			return s.length();
		};
		System.out.println(strLength.apply("Santosh"));

	}

}
