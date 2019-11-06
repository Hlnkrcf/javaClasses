package com.class12;

public class Quiz1 {

	public static void main(String[] args) {
		int n1=1;
		int n2=2;
		
		if( n1 > n2 ){
		System.out.println(" 1 is greater than 2");
		}else{
		System.out.println(" 2 is greater than 1");
		}

	System.out.println("================================");
	
	int day = 7;

	switch(day)
	{
	case 1:
	System.out.println("Monday");
	case 2:
	System.out.println("Tuesday");
	case 3:
	System.out.println("Wednesday");
	case 4:
	System.out.println("Thursday");
	case 5:
	System.out.println("Friday");
	}
	
	double discount;
	char code = 'C' ;

	switch ( code )
	{
	case 'A':
	discount = 0.0;

	case 'B':
	discount = 0.1;

	case 'C':
	discount = 0.2;

	default:
	discount = 0.3;
	}
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	int y = 0;
	for (int i = 0; i < 10; ++i) {
	y += 1;
	}
	
	 
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	int z=2, sum=0;

     while(z<9) {

        z++;

        sum=sum+z;

     }

     System.out.print(sum);
	
	System.out.println("///////////////////////////////////");
	
//	for(int i = 0; i <= 5; i++ ) {
//		   System.out.println("i = " + i );
//		}
//
//		System.out.println("i after the loop = " + i );
	
	
	int count = 0;
	while (count++ < 10) {
	System.out.println("Welcome to Java");
	}
	
	int zz = 0;
    for (int yy = 0; yy >= zz; ++yy, zz++) {
        System.out.print(yy + "~");
        System.out.println(zz);
	
	}

}}
