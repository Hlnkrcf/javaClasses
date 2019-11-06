package com.class9;

public class MorePatternTask {

	public static void main(String[] args) {
		
           for (int i  = 0; i <= 4; i++) {

			for (int m = 0; m <=i; m++) {

				System.out.print("*");
			}
			System.out.println();

		}

	System.out.println("==================================================");
	
           for (int i  = 0; i <= 9; i++) {

   			for (int m = 0; m <=i; m++) {

   				System.out.print(m);
   			}
   			System.out.println();
	
	
           }
	
           System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
           
           for(int k=1; k<=9; k++) {
        	   
        	   for (int l=1; l<=k; l++) {
        		   System.out.print(k);
        	   }
           System.out.println();
           }
        	   
           System.out.println("------------------------------------------------------------");
	
	for (int x=9; x>=0; x--) {
		for (int y=9; y>=x; y--);
		System.out.print(x);
	}
	 System.out.println();
	}

}


