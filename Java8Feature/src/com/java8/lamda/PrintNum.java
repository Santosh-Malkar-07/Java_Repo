package com.java8.lamda;

import java.util.stream.IntStream;

public class PrintNum {

	public static void main(String[] args) {

		// IntStream.range(0, 10).forEach(data -> System.out.println(data));
		IntStream.rangeClosed(1, 10).forEach(data -> {

			System.out.println(data);
			if (data % 2 == 0) {
				//System.out.println(data);
			}
		});
	}

}
