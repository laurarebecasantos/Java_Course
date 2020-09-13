package io.github.laurarebecasantos.lesson0086;

import java.util.Scanner;

class Lesson0086 {

	public static void main(String[] args) {

		
		/* Make a program that asks the user to enter a number, then add all the digits
		 * of the number.
		 * 
		 * Examples: 1111 = 1 + 1 + 1 + 1 = 4 2090 = 2 + 0 + 9 + 0 = 11
		 */
		 
		System.out.println("Enter a number of several digits: ");
		int number = new Scanner (System.in) .nextInt();
		int sum = 0;
		
		while(number>0) {
		// Get the number module entered
			int module = number % 10;
		// Increment the module the variable sum
			sum += module;
		// Divide the number by 10 and assign it to variable * number *
			number /= 10;
		// Partial sum value in each while cycle:
			System.out.println("The sum value is: "+ sum);
		}
		System.out.println();
		System.out.println("The sum of the numbers is: "+ sum);
		
		
	    /* Lesson0086
		 * Java exercises 10 - Sum of all digits
		 * 
		 * Using module
		 */

	}
}
