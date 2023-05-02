package com.java8.lamda;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstRepetatedString {

	public static void main(String[] args) {

		String s1 = "cHello Java prHoseram";
		String[] str = s1.split("");
		Map<Object, Long> result = Arrays.stream(str)
				.collect(Collectors.groupingBy(data -> data, LinkedHashMap::new, Collectors.counting()));

		for (Map.Entry<Object, Long> result1 : result.entrySet()) {
			if (result1.getValue() == 1) {
			//	System.out.println(result1.getKey());
				break;
			}
		}

		Optional<Object> resdata = result.entrySet().stream().filter(data1 -> data1.getValue() == 1)
				.map(data -> data.getKey()).findFirst();

		if (resdata.isPresent()) {
			System.out.println(resdata.get());
		}

	}

}
