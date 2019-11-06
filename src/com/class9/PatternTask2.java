package com.class9;

public class PatternTask2 {

	public static void main(String[] args) {
		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1

		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}

		System.out.println("#############################################");

		// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

		for (int i1 = 1; i1 <= 5; i1++) {
			for (int j1 = 1; j1 <= i1; j1++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
