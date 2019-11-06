package com.class4;

import java.util.Scanner;

public class Class4Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner house = new Scanner(System.in);
		System.out.println("Please enter the amount of loan");
		int loan = house.nextInt();
		
		if (loan<200000) {
			System.out.println("Loan will be Processed");
		
		}else {
			 
	      System.out.println("Loan Rejected");
			
	}
System.out.println("**************************************************************");


	Scanner age = new Scanner (System.in);
	System.out.println("Please enter your age");
	int num=age.nextInt();
	
	if (num>=18) {
	System.out.println("You will get driver license");
	
	}else
	{ System.out.println("you will receive learnit permit");
		
	}
	
	System.out.println("---------------------------------------------------------------");

	
	
	}
}