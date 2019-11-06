package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=90;
		int b=30;
		
		if (a>b) {
			System.out.println("a is larger than b");
			
		}else { 
			
			System.out.println("a is smaller than b");
			
			
		}
	
	int expectedHours=15;
	int actualHours=20;
	
	if(actualHours>expectedHours) {
		
		System.out.println("you will succeed");
	
	}else {
           System.out.println("please study more");
	}
	
	double teaPrice=4.99;
	double allowedPrice=3.99;
	//if price is more than I can effort i will Not buy
	//if price is less or mathches what I can afford then I will buy tea
	
	if(allowedPrice<=teaPrice) {
	     System.out.println("I will buy tea");
	
	}else {
    
		System.out.println("I cannot sfford, I need to study more");
		System.out.println("And I will enjoy my tea");
		
	}
	
	System.out.println("I will study more");
	
	}
	
}
	


