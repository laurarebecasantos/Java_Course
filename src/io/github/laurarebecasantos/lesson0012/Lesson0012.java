package io.github.laurarebecasantos.lesson0012;

import java.util.Scanner;

class Lesson0012 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name;
		double n1, n2, n3, n4, result;
		
		System.out.println("Hi, what your name?");
		name = in.next();
		
		System.out.println("Hi " + name + ". Enter your first note: ");
		n1 = in.nextDouble();
		
		System.out.println("Enter your second note: ");
		n2 = in.nextDouble();
		
		System.out.println("Enter your third note: ");
		n3 = in.nextDouble();
		
		System.out.println("Enter your fourth note: ");
		n4 = in.nextDouble();
		
		result = (n1 + n2 + n3 + n4) / 4;
		
		if (result >= 7) {
			System.out.println("Congrats " + name + ", your spent with grade: " + result + ".");
				
		} else {
			System.out.println("Sorry " + name + ", you didn't, your grade is: " + result + ".");
		}
		
		/* Lesson0012
		 * Calculating grades
		 * Programming for calculating notes with mathematical operators
		 * 
		 */
		
	}
}

