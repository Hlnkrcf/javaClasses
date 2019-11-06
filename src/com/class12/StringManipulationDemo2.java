package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
		/*
         * .contains();
         * This method  searches the sequence of characters in the string.
         * If the sequences of characters are found,
         * then it returns true otherwise returns false.
         */
        String sentence="It was raining";
        String sen="raining";
        System.err.println(sen.contains(sentence));
        
        System.out.println(sentence.contains("was"));
        
        // Create two Strings and initialize them with some value.
        //implement the following methods on those strings.
        
        /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
		

            String i="GMC and American Company";
            String j="American";
            
            System.out.println(i.length());
            System.out.println(j.length());
            
            System.out.println(i.equals(j));
            System.out.println(i.equalsIgnoreCase(j));
            
            System.out.println(i.toLowerCase());
            System.out.println(j.toUpperCase());
            
            System.out.println(i.contains(j));
            System.out.println(i.toLowerCase().contains(j.toLowerCase()));
	
	
	}

}
