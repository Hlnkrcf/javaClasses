package com.class3;

public class IfElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {

			System.out.println("Num1 is larger than num2");

		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int n1 = 100;
		int n2 = 100;

		if (n1 > n2) {

			System.out.println("N1 is larger than n2");

		} else if (n1 == n2) {
			System.out.println("N1 is equal to num2");

		} else {
			System.out.println("N1 is smaller than num");

			int day = 6;

			if (day == 1) {
				System.out.println("Today is Monday. I have to go work");
			} else if (day == 2) {
				System.out.println("Today is Tuesday. I have SDLC class");
			} else if (day == 3) {
				System.out.println("Today is Wednesday. I have Java Review class");
			} else if (day == 2) {
				System.out.println("Today is Thurday. I have SDLC Review class");

			} else if (day == 2) {
				System.out.println("Today is Friday. I have SDLC class");
			} else if (day == 2) {
				System.out.println("Today is Saturday. I have SDLC class");

			} else if (day == 2) {
				System.out.println("Today is Tuesday. I have SDLC class");
			}
		}

	}
}