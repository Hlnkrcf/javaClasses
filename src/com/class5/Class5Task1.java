package com.class5;

import java.util.Scanner;

public class Class5Task1 {

	public static void main(String[] args) {
		int day=8;

	 if (day>=1 && day<=5) {
		System.out.println("It is a weekday"); 
	 }else if (day==6 && day==7) {
		 System.out.println("It is a weekend");
	 }else {
		 System.out.println("Invalid day");
	 }
		
		System.out.println("*******************************");
		
		Scanner height=new Scanner(System.in);
		System.out.println("Please enter your height");
		
		int num=height.nextInt();
		
		if (num<5) {
			System.out.println("short");
		}else if (num>=5 && num<6) {
			System.out.println("medium");
		}else if (num>=6) {
			System.out.println("tall");
		}
	}

}
