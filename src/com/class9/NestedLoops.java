package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1; i<=3; i++) {
	
	System.out.println("I am outer loop");
	 
	for (int j=1; j<=3; j++) {
		System.out.println("I am inner loop");
		
	}
}


System.out.println("_________________________________________________");
	
	
for (int n=1; n<=2; n++) {
	
	System.out.println("I am outer loop");
	 
	for (int y=1; y<=3; y++) {
		System.out.println("I am inner loop");
	
	}

}


System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

for (int n=1; n<=3; n++) {
	
	System.out.println(n);
	 
	for (int y=1; y<=4; y++) {
		System.out.println(y);
	
	}
}

System.out.println("*******************************************************");

for (int n=1; n<=3; n++) {
	 
	for (int y=1; y<=4; y++) {
		System.out.println(n+" "+y);
	
	}
}
	}
	}
	
