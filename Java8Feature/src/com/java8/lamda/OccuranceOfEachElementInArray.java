package com.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccuranceOfEachElementInArray {

	public void getOccuranceUsingSet(List<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		for (Integer integerData : set) {
			System.out.println(integerData + "    Occur   " + list.stream().filter(data -> data == integerData).count()
					+ "   Times");
		}
	}

	public void occurElement(List<Integer> list) {

		list.stream().distinct().forEach(data -> {
			System.out
					.println(data + "   Occur   " + list.stream().filter(data1 -> data1 == data).count() + "  Times ");
		});
	}

	public void IntegralOccurnce() {
		String s = "aabbcccfdfsf";

		String[] str = s.split("");
//		Character[] str = new Character[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			str[i] = s.charAt(i);
//		}

		Arrays.stream(str).distinct().forEach(data -> {
			System.out.println(data + "    occurence   "
					+ Arrays.stream(str).filter(data1 -> data1.equals(data)).count() + "    Timesss ");
		});

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(15);
		list.add(5);
		list.add(3);

		Integer[] a = { 10, 10 };

		OccuranceOfEachElementInArray occuranceOfEachElementInArray = new OccuranceOfEachElementInArray();
		// occuranceOfEachElementInArray.getOccuranceUsingSet(list);

		occuranceOfEachElementInArray.IntegralOccurnce();
	}

}
