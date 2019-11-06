package com.class7;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean workDay=true;
		 int day=1;
		 
		 while (workDay) {
			// System.out.println("I need a day off");
			 if (day==6) {
			 workDay=false;	 
			 System.out.println("I don't need a day off anymore");
			 }else {
				 System.out.println("I need a day off");
		 }day++;
	} 
		 
}
		
		
	

}