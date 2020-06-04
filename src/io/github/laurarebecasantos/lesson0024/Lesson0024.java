package io.github.laurarebecasantos.lesson0024;

class Lesson0024 {

	public static void main(String[] args) {
		
		int a, b, c;
		int y = 0;
		
		a = 15;
		b = 10;
		c = 5;
		
		/* sum, subtraction, multiplication
		 * division, rest 
		 * 
		 */
		y = a + b;
		y = a - b;
		y = a * b;
		y = a / b;
		y = a % b;
		
		System.out.println(a * b - c);
		System.out.println(a * (b - c));
		System.out.println(a + b / a - b);
		
		
		
		/* Lesson0024
		 * Operators precedence
		 * 
		 * + - sum 
		 * - - subtraction
		 * * - multiplication
		 * / - division
		 * % - division rest
		 * 
		 * Order
		 * 1) ()
		 * 2) *, /, %
		 * 3) +, -
		 * 4) <, <=, >, >=
		 * 5) ==, !=
		 */
	}
}
