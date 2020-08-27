package io.github.laurarebecasantos.lesson0083;

import java.util.Scanner;

class Lesson0083 {

	public static void main(String[] args) {

		/*
		 * Write a program that asks the user to inform which multiplication table he
		 * wants to see and store the number in a variable. Then print the
		 * multiplication table on the screen using the FOR statement. To print the
		 * multiplication table, follow the model below:
		 * 
		 * 
		 * Please inform which multiplication table you want: Ax x B10 = Failed 10 Ax x
		 * B9 = Failed 9 Ax x B8 = Failed 8
		 * 
		 * Grades): Ax, B and C represent, respectively: Ax - number of times tables
		 * desired by the user B - number to be incremented C - result of the expression
		 * AX X BX = CX Example: 5 x 10 = 50 5 x 9 = 45 5 x 8 = 40
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type the multiplication table you want:");
		int table = in.nextInt();
		System.out.println("Your table of values: "+table);
		
		for(int x=10; x>=0; x--) {
			int result = table * x;
		System.out.println(table +" x "+ x +" = " + result);
		}
		
		/* Lesson0083
		 * Java exercises 07- Times tables inside out
		 * 
		 * Using for
		 * 
		 */

	}

}
