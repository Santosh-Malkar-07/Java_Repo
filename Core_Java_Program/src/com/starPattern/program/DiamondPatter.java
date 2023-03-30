package com.starPattern.program;

public class DiamondPatter {

	public static void main(String[] args) {
		int N1 = 10;
		int middle = N1 / 2;
		int middle1 = middle;
		int condit = 0;
		int num = 0;
		for (int i = 1; i <= N1; i++) {
			condit = i;
			for (int j = 1; j <= N1; j++) {
				condit = N1 - i + 1;

				if (j >= condit) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
