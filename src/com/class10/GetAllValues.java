package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] country = { "Tajiikistan", "USA", "Turkey" };
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("Tajikistan")) {
				System.out.println("Capital City of Tajikistan is Dushanbe");

			} else if (country[i].equals("USA")) {
				System.out.println("Capital City of USA is Washington, DC");

			} else {
				System.out.println("Capital City of Turkey is Ankara");
			}
		}
	
	
	
	}
}
