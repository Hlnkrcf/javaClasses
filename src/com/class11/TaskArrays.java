package com.class11;

public class TaskArrays {

	public static void main(String[] args) {

//		Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
//		Create an array on integers and calculate the sum of all elements in an array.
//		Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
//		

		String[] cars = { "Ford", "GMC", "Toyota", "Mazda", "BMW", "Dodge" };
		for (String s : cars) {
			System.out.println(s);
		}

		System.out.println("______________________________________");

		for (int k = 0; k < cars.length; k++) {
			System.out.print(cars[k] + " ");

		}
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int j = 0; j < num.length; j++) {
			sum = sum + num[j];
		}
		System.out.println(sum);

		System.out.println("++++++++++++++++++++++++++++++++++++++");

		String[] c = { "USA", "Bolivia", "Brazil" };
		for (int x = 0; x < c.length; x++) {
			switch (c[x]) {

			}
		}
	}

}
