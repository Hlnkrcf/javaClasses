package com.class10;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades = new char[6];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[2] = 'E';
		grades[3] = 'F';
		System.out.println(grades[1]);

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		// Task 2

		String[] names = new String[6];

		names[0] = "Ali";
		names[1] = "Mehmet";
		names[2] = "Kevin";
		names[3] = "David";
		names[4] = "Edward";
		names[5] = "Michael";
		System.out.println(names[5]);

		// TAsk 2, 2nd way

		String[] name = { "Ali", "Mehmet", "Kevin", "David", "Edward", "Michael" };
		System.out.println(name[5]);

		
		//Create an array to store 5 double values, print all elements in 1 line
		
	double[] dob= {12.14, 15.17, 13.01, 14.02, 17.03 };
	
		int a=dob.length;
		for (int i=0; i<a; i++) {
		
		System.out.print(dob[i]+", ");
		
		
		
		
		
		
	}
	
	}

}
