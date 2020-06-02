package io.github.laurarebecasantos.lesson0008;

import java.util.Scanner;

class Lesson0008 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Whats your name? ");
		String name = in.next();
		System.out.println("Hello, " + name + ". Inform age of your dog: ");
		int ageDog = in.nextInt();
		ageDog = ageDog * 7;
		System.out.println(name + " , your dog has: " + ageDog + " years.");


		/* Ps.: Lesson0008
		 * Capture of data for variables String and Int.
		 * 
		 */
	}
}
