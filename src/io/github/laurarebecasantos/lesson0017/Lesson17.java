package io.github.laurarebecasantos.lesson0017;

import java.util.Scanner;

class Lesson17 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name;
		final int young, senior;
		young = 17;
		senior = 60;
		int age = 0;
		
		System.out.println("Hello, Whats your name? ");
		name = in.next();
		System.out.println("Hi " + name + ", How old are you?");
		age = in.nextInt();
		
		if(age <= young) {
			System.out.println("Cool " + name + ", you are young!");
		}else {
			if(age >= senior) {
			System.out.println("Wow " + name + ", you are old!");
			}else {
				if(age > young || age < senior) {
					System.out.println("Hey! " + name + ", you are in middle age hehe..");
				}
			}
		}
		
		/* Lesson0017
		 * Logic operators introduction
		 * Using if/else if chained
		 * Using logic operators for condition
		 */
	}
}
