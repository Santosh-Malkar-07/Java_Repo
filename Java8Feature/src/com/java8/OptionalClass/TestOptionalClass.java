package com.java8.OptionalClass;

import java.util.Optional;

public class TestOptionalClass {

	public static void main(String[] args) {

		String[] str = new String[10];
	//	str[5] = "santosh";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String s = str[5].toUpperCase();
			System.out.println(s);
		} else {
			System.out.println("string value is not present");
		}
	}

}
