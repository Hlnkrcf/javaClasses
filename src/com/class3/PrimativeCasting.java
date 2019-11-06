package com.class3;

public class PrimativeCasting {

	public static void main(String[] args) {
		
		//Widening(Implicit/Automatic)
		//Narrowing (Explicit/Manual)

		byte b=127;
		int i=b;
	System.out.println(i);
		
		
	int num=123;
	double d1=num;
	System.out.println(d1);
	
	//narrowing or explicit or manual casting
	
	double d2=123.56;
	int num2=(int)d2;
	System.out.println(num2);
	
	int num3=1000;
	byte by=(byte)num3;
	System.out.println(num3);
	
	
	
	
	}
}
