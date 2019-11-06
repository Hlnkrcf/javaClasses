package com.class9;

public class Pattern {

	public static void main(String[] args) {
		for (int k = 0; k <= 5; k++) {

			for (int y = 0; y < 5; y++) {
				for (int l = 1; l <= 5; l++) {

					System.out.println("*");
				}

			}

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

			for (int k1 = 0; k1 <= 3; k1++) {

				for (int y = 0; y < 5; y++) {

					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println("/////////////////////////////////////////////////");

		for (int k1 = 0; k1 <= 2; k1++) {

			for (int y = 0; y < 5; y++) {

				System.out.print(k1);
			}
			System.out.println();
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		for (int l = 0; l <= 4; l++) {

			for (int m = 1; m < 10; m++) {

				System.out.print(m);
			}
			System.out.println();

		}

		System.out.println("################################################");

		for (int o = 5; o >= 1; o--) {

			for (int p = 5; p >= 1; p--) {

				System.out.print(o);
			}
			System.out.println();

		}

	}
}
