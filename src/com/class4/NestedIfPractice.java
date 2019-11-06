package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFriday = true;
		int day = 11;

		if (isFriday) {

			System.out.println("Today is Friday");

			if (day == 13) {
				System.out.println("I will watch movies");

			} else {
				System.out.println("I will watch comedy");
			}

		} else {
			System.out.println("Today is not Friday");

		}
	}
}
