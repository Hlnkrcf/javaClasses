package com.class7;

public class Homework2 {

	public static void main(String[] args) {
		/*You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal=5;
		 * After user paid then say "Enjoy your coffee!"
		 */

	
		char direction = 'W';
		char west = 'N';

		switch(direction)
		{
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
		//case west:
		//System.out.println("West");
		//break;
		case 'S':
		System.out.println("South");
		}
	
		
		boolean x = true;
		boolean y = true;
		if (x || y) {
		System.out.println(true);
		} else {
		System.out.println(false);
		}
	
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if( f == d ) {
		   if( f == i ) {
		      System.out.println("f, d and i are equal");
		    } else {
		      System.out.println("f, d are equal but i is not equal");
		    }

		} else {
		    System.out.println("f and d are not equal");
		}	
	
		float fl = 5.3f;
		   if (fl == 5.3) {
		      System.out.println("Both are equal");
		   } else {
		      System.out.println("Both are not equal");
		   }
	
	
		   int a = 7 * 3 + 6 / 2 - 5;
	        int b = 21 - 8 + a % 3 * 11;

	            if(a < b) {
	                 System.out.println("A is less than B");
	             }

	            if(a == b) {

	                 System.out.println("A is equal to B");
	            }

	           if(a > b) {
	                 System.out.println("A is greater than B");
	            }
		   
//	           boolean a,b,c;
//	           a = b = c = true;
//
//	                if( !a || ( b && c ) ) {
//	                   System.out.println("If executed");
//	                } else {
//	                   System.out.println("else executed");
	              //  }
	
	           for(int z=20; z<40; z=z+3)   {        

	        	   System.out.print(z+ " ");
	
	           }
	
	           int e=1;

	           while(e<5) {   

	              e++;   

	              System.out.print(e);

	           }
	
	           int m=2, total=0;

	           while(m<6) {

	              total=total+m;

	              m++;

	           }
	           
	           System.out.println("******************************");
	           System.out.print(total);
	
	           int z=2, sum=0;

	           while(z<9) {

	              z++;

	              sum=sum+z;

	           }

	           System.out.print(sum);
	
	          System.out.println("+++++++++++++++++++++++++++");
	           
	           int h=1;

	           do{

	              h++;

	              System.out.print(h);

	           }while(h<5);

	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	           int k=3, tot=0;

	           do{

	              tot=tot+k;

	              k++;

	           } while(k<11);

	           System.out.print(tot);
	
	System.out.println("==============================");
	
	 for(int p = 0; p <= 5; p++ )
     {
         System.out.println("p = " + p );
     }
	 
	 
	 int yy = 0;
	 for (int ii = 0; ii< 10; ++ii) {
	 yy+= 1;
	 }
	
	}

}
