package com.starPattern.program;

public class StarPattern1 {

	public static void main(String[] args) {

		int N = 4;
		for (int i = 1; i <= N; i++) {
			int value = i;
			for (int j = 1; j <= N + 1; j++) {

				if (j <= i + 1) {
					System.out.print(value + " ");
					value = value * 2;
				}
			}
			System.out.println();
		}
	}

}
