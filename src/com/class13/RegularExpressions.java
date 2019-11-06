package com.class13;

import java.util.Scanner;

public class RegularExpressions {

	public static void main(String[] args) {

		// print only text and not numbers

		// String str="1425Hel45456lo56"; //Hello

		// System.out.println(str.replaceAll("[0-9]", "")); //Leave only text

		Scanner scan = new Scanner(System.in);

		// boolean gender=F;
		
		String gender = scan.nextLine();
		// String F = null;
		// String M = null;
		int age = scan.nextInt();
		if (gender.equals("M")) {
			
			if (age > 25) {
				System.out.println("Man");

			} else {
				System.out.println("Boy");
			}
		} else if (gender.equals("F")) {
			if (age < 25)
				System.out.println("Girl");
		} else {
			System.out.println("Woman");
		}
	}
}
