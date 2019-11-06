package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// Task: create 2D array of String with 2 and 3 columns.
		// and print value in second row and 3rd column

		System.out.println("-----------------------------------------");

		int[][] numbers = { { 8, 7, 5, 3, 8 }, { 1, 5, 6, 4, 9, 2, 3 }, { 3, 6, 8, 0, 7 } };
		System.out.println("The value in index 1 and 4 is= " + numbers[1][4]);

		// To identify the numbers of Rows
		System.out.println("The numbers of Arrays(Rows) are:= " + numbers.length);

		// To identify the numbers of Columns
		System.out.println("The numbers of Columns are:= " + numbers[1].length);

	System.out.println("===============================");
	
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

			}
		}
	}

}
