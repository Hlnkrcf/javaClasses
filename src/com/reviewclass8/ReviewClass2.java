package com.reviewclass8;

public class ReviewClass2 {

	public static void main(String[] args) {
//		boolean workDay = true;
//		int day = 1;
//		while (workDay) {
//		if (day == 6 || day==7) {
//		workDay = false;
//		System.out.println("I do not need a day of anymore");
//		}else {
//		System.out.println("I need a day off");
//		}
//		day++;
//		}

		boolean workDay = true;
		int day = 1;
		while (workDay) {
		if (day == 6 || day==7) {
		workDay = false;
		System.out.println("I do not need a day of anymore");
		}else {
		System.out.println("I need a day off");
		}
		day++;
		}



//		Task One	
			/* print only even numbers from 1 to 20 */

        int num=1;
        while (num<=20) {
        	if(num%2==0)
        	System.out.print(num+" ");
        	num++;
        }
        
	}

}
