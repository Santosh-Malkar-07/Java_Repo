package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitStringIntoListOfNSize {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("aan", "tan", "can", "ana", "nac", "but");

		List<List<String>> result = new ArrayList<>();

		char[] ch = new char[strList.size()];

		for (int i = 0; i < strList.size(); i++) {

			if (ch[i] == 'Y') {
				continue;
			}
			List<String> list = new ArrayList<>();

			for (int j = i + 1; j < strList.size(); j++) {
				char[] s1 = strList.get(i).toCharArray();
				Arrays.sort(s1);
				char[] s2 = strList.get(j).toCharArray();
				Arrays.sort(s2);

				String data1 = new String(s1);
				String data2 = new String(s2);
				if (data1.equals(data2)) {
					list.add(strList.get(j));
					ch[j] = 'Y';
				}
			}
			list.add(strList.get(i));
			result.add(list);
		}

		System.out.println(result);

//		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		Collection<List<Integer>> resultMap = intList.stream().collect(Collectors.groupingBy(data1 -> data1 % 2 == 0))
//				.values();
//		System.out.println(resultMap);
	}

}
