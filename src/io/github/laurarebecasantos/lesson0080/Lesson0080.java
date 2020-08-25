package io.github.laurarebecasantos.lesson0080;

import java.util.Scanner;

class Lesson0080 {

	public static void main(String[] args) {

		/*
		 * Write a little piece of software that asks your age and that of your mother.
		 * Then print the following 3 information on the screen:
		 * 
		 * 1) your age 2) your mother's age 3) my mom is <years> older than me
		 * 
		 * Notes (s): 1) replace the text <years> with the difference between your age
		 * and your mother's.
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int daughterAge = in.nextInt();
		System.out.println("Enter your mother's age: ");
		int motherAge = in.nextInt();
		
		int years = motherAge - daughterAge;
		
		System.out.println("You have: "+daughterAge+" years.");
		System.out.println("Your mother has: "+motherAge+" years.");
		System.out.printf("Your mom is %d years older than you.", years);

		/*
		 * Lesson0080
		 * Java exercises 04 - Age difference
		 * 
		 * Mathematical operation
		 * Data input and output
		 * Printf(%d);
		 * 
		 */

	}

}
