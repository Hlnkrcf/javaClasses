package hkprac;

import java.util.Scanner;

public class HomeworkPrc {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Do you need a loan?");

		// int cs=inp.nextInt();

		boolean loan = true;
		loan = inp.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");

		} else {
			System.out.println("Unknown");
		}

	}
}
