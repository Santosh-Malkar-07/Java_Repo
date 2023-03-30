package com.starPattern.program;

public class DiamonPattern {

	public static void main(String[] args) {

		int column = 10;
		int row = column * 2 - 1;
		int k = 0;
		for (int i = 1; i <= row; i++) {
			if (i <= column) {
				k++;
			} else {
				k--;
			}
			for (int j = 1; j <= column; j++) {

				if (j >= column + 1 - k) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
