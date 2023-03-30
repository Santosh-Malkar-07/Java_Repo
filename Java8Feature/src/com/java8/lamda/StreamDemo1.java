package com.java8.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {

		/* Filter Method. */
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i <= 10; i++) {
//			list.add(i);
//		}
//	//	System.out.println(list);
//
//		List<Integer> list2 = list.stream().filter(i ->( i % 2 == 1)).collect(Collectors.toList());
//		System.out.println(list2);

		/* Map Method. */
//		ArrayList<String> l = new ArrayList<String>();
//		l.add("rkxxp");
//		l.add("rkxxa");
//		l.add("rkcsdcv");
//		l.add("rvki");
//		l.add("rvkirxa");
//
//		List<String> listData = l.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
//		//System.out.println(listData);
//
//		Long count = l.stream().filter(data -> data.length() == 5).count();
//		System.out.println(count);

		/* Sort Method. */
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(15);
		l1.add(10);
		l1.add(5);
		l1.add(30);
		l1.add(25);
		l1.add(20);
//
//		List<Integer> sortedListAsc = l1.stream().sorted().collect(Collectors.toList());
//		//System.out.println(sortedListAsc);
//
//		/* Decending order sorting. */
//		Comparator<Integer> decSort = (I1, I2) -> -I1.compareTo(I2);
//		List<Integer> sortedListDec = l1.stream().sorted(decSort).collect(Collectors.toList());
//		System.out.println(sortedListDec);

//		/* minimum element. */
//		int minimumEle = l1.stream().min((I1, I2) -> I1.compareTo(I2)).get();
//		System.out.println(minimumEle);
//
//		/* Maxmium Exlement. */
//		int MaxmiumEle = l1.stream().max((I1, I2) -> I1.compareTo(I2)).get();
//		System.out.println(MaxmiumEle);

		/* foreach loop for list. */
		l1.stream().forEach(data -> {
			System.out.println(data);
		});

	}

}
