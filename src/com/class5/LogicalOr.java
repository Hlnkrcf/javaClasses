package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		/* 7 days a week
		 * if days is 2 or 4 --> SDLC class
		 * if day 6 or 7 --> Java Class
		 * 
		 */
		
	int day=7;
	//false OR false --> false
	if (day==2 || day==4) {
		System.out.println("SDLC Class");
    }else if (day==6 || day==7) {
    	System.out.println("Java Class");
    }else if (day==1 || day==5) {
    	System.out.println("No Class");
	}else if (day==3) {
		System.out.println("Review Class");
	}else {
		System.out.println("Not a valid day");
	}
		
 System.out.println("******************************************************");   	

 
    String weekDay="friday";
    
    if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
    	System.out.println("SDLC Class");
    }else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
    	System.out.println("Java Class");
    }else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
    	System.out.println("No Class");
    }else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
    	System.out.println("No Class");
    }else if (weekDay.equals("Wdnesday")) {
    	
    	System.out.println("Review Class");
    }else {
    	System.out.println("Not a valid day");
    }
    	
 
 
}
}