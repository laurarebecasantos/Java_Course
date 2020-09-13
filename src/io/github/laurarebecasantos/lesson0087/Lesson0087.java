package io.github.laurarebecasantos.lesson0087;

import java.util.Scanner;

public class Lesson0087 {

	public static int sumDigitsB(int number, int momentarySum){
		if (number<1)
			return momentarySum;
		momentarySum+=(number % 10);
		return sumDigitsB(number/10, momentarySum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Type a number: ");
		int number = new Scanner(System.in).nextInt();
		int sum = sumDigitsB(number, 0);
		
		System.out.println("The value of sum of digits is: "+ sum);
		
		/* Lesson0087
		 * Java exercises 11 - Sum of all digits II (rescursivity)
		 * 
		 * Recursive function
		 * 
		 */
		
	}
	
}
