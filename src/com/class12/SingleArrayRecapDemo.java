package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		//1D arrays
		
		int [] array1=new int[4];
		
        array1[0]=12;   //array1=List of numbers
        array1[1]=13;
        array1[2]=14;
        array1[3]=14;
        
      // System.out.println(array1[1]);
       //1. Way
        for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	 
          System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	
        //2. Way
          for (int i = 0; i < 4; i++) {
  			System.out.println(array1[i]);
  		}
        
        
        
        System.out.println("---------------------------------------------------------");
        
	//for each loop
        
        for(int s: array1) {
        	System.out.println(s);
        }
	
        //Sum of the numbers
        int num1=0; 
        
          num1=num1+arrays[num1];
        for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
