package io.github.laurarebecasantos.lesson0025;

class Lesson0025 {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 4;
		
		
		System.out.println(" Expression x += y: " + (x += y));
		
		x = 12;
		System.out.println(" Expression x -= y: " + (x -= y));
		
		x = 12;
		System.out.println(" Expression x *= y: " + (x *= y));
		
		x = 12;
		System.out.println(" Expression x /= y: " + (x /= y));
		
		x = 17;
		System.out.println(" Expression x %= y: " + (x %= y));
		
		
		
		/* Lesson0025
		 * Assignment operators
		 * 
		 * Using assignment operator the program 
		 * compiles more easily, 
		 * taking a more readable form.
		 * x = x + y equals x += y
		 * 
		 * x += y
		 * x -= y
		 * x *= y
		 * x /= y
		 * x %= y
		 */
	}
}
