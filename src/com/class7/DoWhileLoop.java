package com.class7;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//mostly used
		int num=100;
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
	
	//rare
		int num1=10;
		do {
			System.out.println("Bye");
            num1++;   		
		}while(num1<=1);
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		int even=20;
		do  {
			
			System.out.println(even);
			even+=2;
		}while(even<=50);
		
		
		
	}

}
