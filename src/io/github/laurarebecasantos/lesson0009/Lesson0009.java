package io.github.laurarebecasantos.lesson0009;

import java.util.Scanner;

class Lesson0009 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double n1, n2, sum, subtraction, multiplication, division;
		
		/*
		 * int n1, n2, sum, subtraction, multiplication, division;
		 * 
		 * System.out.println("Hello, inform a number: "); n1 = in.nextInt();
		 * 
		 * System.out.println("Please, insert other number: "); n2 = in.nextInt();
		 * 
		 * sum = n1 + n2; System.out.println("The result of sum is: " + sum);
		 * 
		 * subtraction = n1 - n2; System.out.println("The result of subtraction is " +
		 * subtraction);
		 * 
		 * multiplication = n1 * n2;
		 * division = n1 / n2;
		 * 
		 */

		System.out.println("Hello, inform a number: ");
		n1 = in.nextDouble();

		System.out.println("Please, insert other number: ");
		n2 = in.nextDouble();

		sum = n1 + n2;
		System.out.println("The result of sum is: " + sum);

		subtraction = n1 - n2;
		System.out.println("The result of subtraction is " + subtraction);

		multiplication = n1 * n2;
		division = n1 / n2;
		
		System.out.println("The result of multiplication is: " + multiplication);
		System.out.println("The result of division is " + division);
		
		
		/*
		 * Lesson0009 Creathing a calculator. 
		 * The value is being calculated by the variable int and double.
		 * Using mathematical operations.
		 * 
		 */
	}
}
