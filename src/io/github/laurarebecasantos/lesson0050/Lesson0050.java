package io.github.laurarebecasantos.lesson0050;

import java.util.Scanner;
import java.util.Arrays;

class Lesson0050 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] values = new int[7];
		
		//Ask the user to enter 7 numbers (store in an array):
		for(int i=0; i<7; i++) {
			System.out.printf("Imput a number [%d]: ", i+1);
			values[i]= in.nextInt();	
		}
				//System.out.println(Arrays.toString(values));
		
		//Add up all the numbers and display on the screen:
		int sumElements = 0;
		for(int x=0; x<7; x++) {
			sumElements += values[x];	
		}
		System.out.printf("The sum of elements is: %d \n\n", sumElements);
		
		//Multiply the index by its value:
		int product = 0;
		for(int x=0; x<7; x++) {
			product = values[x] * x;
	
		System.out.printf("Multiplying the index by the element is: %d * %d = %d \n", values[x], x, product);
		}
		
		//Calculate the arithmetic mean:
		double sum = sumElements;
		double avarage = sum / 7.0;
		
		System.out.printf("\n The arithmetic average is: %f", avarage);
		
		
		/* Lesson0050
		 * Array Exercise part II
		 * 
		 * Ask the user to enter 7 numbers (store in an array):
		 * Add up all the numbers and display on the screen:
		 * Multiply the index by its value:
		 * Calculate the arithmetic mean:
		 * 
		 */	
	}
}
