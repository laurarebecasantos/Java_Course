package io.github.laurarebecasantos.lesson0079;

import java.util.Scanner;

class Lesson0079 {

	public static void main(String[] args) {

		/*
		 * Make a program that asks the user's name, age and city of birth. Then print
		 * the sentence below by changing the tag <name>, <ity>, <city>, by name, age
		 * and city provided by the user.
		 * 
		 * "Hi. My name is <name>, I'm from <city>, I am <age> and I am learning to
		 * program "
		 */

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello, how are you? Enter your name:");
		String name = in.next();
		System.out.println("Okay, now enter your age:");
		String age = in.next();
		System.out.println("Right. Lastly inform your city:");
		String city = in.next();
		
		System.out.println("Hi. My name is "+name+", I'm from "+city+", I am "+age+" and I am learning to program.");
		
		/*
		 * Lesson0079 
		 * Java exercises 03 - Reading and printing text and numbers.
		 * 
		 * Utilitário Scanner;
		 * nextLine(); vs next();
		 */
	}

}
