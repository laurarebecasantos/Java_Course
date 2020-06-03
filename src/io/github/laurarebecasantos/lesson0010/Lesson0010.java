package io.github.laurarebecasantos.lesson0010;

import java.util.Scanner;

class Lesson0010 {

	public static void main(String[] args) {

		/*
		 * int num; num = 11;
		 * 
		 * if (num == 10) { System.out.println("Yes, is equals.");
		 * 
		 * }else { System.out.println("No, the number is not!"); }
		 * 
		 */

		int n1;
		Scanner in = new Scanner(System.in);

		System.out.println("Type the number one: ");
		n1 = in.nextInt();

		if (n1 == 1) {

			System.out.println("Thanks for type the number one!");

		} else {

			System.out.println("The number typed is not equals one.");

		}
		
		
		
		/* Ps.: Lesson0010
		 * Structure of decision
		 * Using the structure if and else for decision making
		 * 
		 */
	}
}
