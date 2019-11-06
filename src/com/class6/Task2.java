package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		////ask user to enter 2 numbers and then compare
		 //which is larger
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Enter 2 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " is bigger than " + num2);
		}else if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		} else {
			System.out.println(num2 + " is bigger than " + num1);
		}
		
	}

}
