package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age if age is from 1 to 3 --> You are a baby if age is from
		 * 3 to 5 --> You are a toddler if age is from 5 to 12 --> You are a kid if age
		 * is from 12 to 19 --> You are a teenager if age is >20--> You are an adult
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = input.nextInt();
		String human;

		if (age >= 1 && age < 3) {
			 System.out.println("You are baby");
			human = "baby";
		} else if (age > 3 && age <= 5) {
			 System.out.println("You are toddler");
			human = "toddler";
		} else if (age > 5 && age <= 12) {
			 System.out.println("You are kid");
			human = "kid";
		} else if (age > 12 && age <= 19) {
			 System.out.println("You are teenager");
			human = "teenager";
		} else if (age > 20) {
			 System.out.println("You are adult");
			human = "adult";

		
		System.out.println("You are" + " " + human);
		}

		 //public static void main(String[] args) {
		    	
		    	int number1, number2;
		    	
		    	// Assigning 5 to number1 
		    	number1 = 5;
		    	System.out.println(number1);
		    	    	
		    	// Assigning value of variable number2 to number1
		    	number2 = number1;
		    	System.out.println(number2);
		    }
	
	}


