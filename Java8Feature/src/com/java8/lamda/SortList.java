package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(30);
		list.add(50);
		list.add(0);
		list.add(500);
		list.add(300);
		list.add(40);
		list.add(30);

		Comparator<Integer> compareMethod = (I1, I2) -> {
			if (I1 > I2) {
				return 1;
			} else if (I1 < I2) {
				return -1;
			} else {
				return 0;
			}
		};

//		Collections.sort(list);
//		Collections.sort(list, Collections.reverseOrder());

//		Comparator<Integer> sorterdData = (p1, p2) -> {
//		if (p1 > p2) {
//			return -1;
//		} else if (p1 < p2) {
//			return 1;
//		} else {
//			return 0;
//		}
//	};
//		Collections.sort(list, sorterdData);

//		List<String> list = new ArrayList<String>();
//		list.add("Sant");
//		list.add("Anana");
//		list.add("Pri");
//		list.add("Bha");
//		list.add("Sgalu");

//		Collections.sort(list, Collections.reverseOrder());
		Comparator<String> sortedData = (s1, s2) -> {
			return s1.compareTo(s2);
		};
//		Collections.sort(list, sortedData);

		System.out.println(list);
	}

}
