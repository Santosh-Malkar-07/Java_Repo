package com.starPattern.program;

public class StartPattern2 {

	public static void main(String[] args) {

		int N = 10;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {

				if (j >= N + 1 - i) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

/*
 * Print below pattern first. // * // ** // *** // **** // *****
 * 
 * write this condition in if statement. System.out.print(" *");
 * 
 */
