package io.github.laurarebecasantos.lesson0007;

import java.util.Scanner;

class lesson0007 {
	public static void main(String[] args) {

		System.out.println("Type it a number: ");
		Scanner in = new Scanner(System.in);
		System.out.println("The number is: " + in.nextLine() + ".");
		
		
		System.out.println("Inform the age of the dog: ");
		Scanner dog = new Scanner(System.in);
		int ageDog = in.nextInt();
		ageDog = ageDog * 7;
		System.out.println("Your dog has: " + ageDog + " years.");
		
		

				
		/* Ps.: Lesson0007
		 * Using Java.util for enter data.
		 * Using Scanner to reserve value.
		 * 
		 */
	}

}


