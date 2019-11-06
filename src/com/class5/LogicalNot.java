package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		//If name is not Marry
		String name="Marry";
		String name2="Anna";
		
		if (!(name.equals("Marry") || name2.equals("Anna"))) {
			
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
		
		
		
		
	}

}
