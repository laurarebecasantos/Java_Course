package io.github.laurarebecasantos.lesson0049;

import java.util.Arrays;
import java.util.Scanner;

class Lesson0049 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int [] values = new int[7]; 
		
		
				
		for(int i=0; i<7; i++) {
			
			System.out.printf("Imput a number [%d]: ", i+1);
			values[i] = in.nextInt();	
		}
		
		
		System.out.println(Arrays.toString(values));
	}

	
	/* Lesson0049
	 * Array Exercise
	 * 
	 * Add up all the numbers and display it on the screen.
	 * 
	 * 
	 * Using for.
	 * Array.toString Method
	 * 
	 */
}
