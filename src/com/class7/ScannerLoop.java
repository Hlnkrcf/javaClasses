package com.class7;

import java.util.Scanner;

public class ScannerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ask user to enter name 5 times
 * and our output should be "Good afternoon__________"*/
 
		Scanner scan = new Scanner(System.in);
		int i=5;
		
		while (i<10) {
			System.out.println("please enter your name");
			String name=scan.nextLine();
			System.out.println("Good afternoon " + name);
			i++;
		}
		
		
	}

}
