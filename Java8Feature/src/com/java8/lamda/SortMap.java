package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.xml.crypto.Data;

class CompareMap {

	public void getSortedMap(HashMap<String, Integer> hm) {
		Stream<Entry<String, Integer>> sortedAscending = hm.entrySet().stream().sorted(Entry.comparingByKey());
//
		Stream<Map.Entry<String, Integer>> sortedDecending = hm.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByKey()));

		sortedDecending.forEach(data -> {
			System.out.println(data);
		});

	}

	public void getSortedMapUsingSet(HashMap<String, Integer> hm) {

		List<Map.Entry<String, Integer>> listData = new ArrayList<>();
		listData.addAll(hm.entrySet());

		Comparator<Map.Entry<String, Integer>> comapre = (o1, o2) -> {

			String s1 = o1.getKey();
			String s2 = o2.getKey();
			return s1.compareTo(s2);
		};
		Collections.sort(listData, comapre);
		System.out.println(listData);
	}

	public void getSortedMapUsingLength(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> dataList = new ArrayList<Map.Entry<String, Integer>>();
		dataList.addAll(hm.entrySet());

		Comparator<Map.Entry<String, Integer>> compareData = (o1, o2) -> {

			int length1 = o1.getKey().length();
			int length2 = o2.getKey().length();

			if (length1 > length2) {
				return 1;
			} else if (length1 < length2) {
				return -1;
			} else {
				return 0;
			}
		};

		Collections.sort(dataList, compareData);
		System.out.println(dataList);
	}
}

public class SortMap {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("", 10);
		hm.put("AAA", 20);
		hm.put("LLLw", 40);
		hm.put("ZZ", 30);
		hm.put("LLL", 40);
		hm.put("BBB", 40);
		hm.put("B", 40);
		hm.put("PPPYYy", 40);

		CompareMap compareMap = new CompareMap();
//		compareMap.getSortedMap(hm);
//		compareMap.getSortedMapUsingSet(hm);
		compareMap.getSortedMapUsingLength(hm);

	}

}
