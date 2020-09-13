package io.github.laurarebecasantos.lesson0088;

import java.util.Scanner;

class Lesson0088 {

	public static int sumDigitsC(int number){
		if(number<10)
			return number;
		else
			return sumDigitsC(number/10)+number%10;
	}
	
	public static void main (String[] args) {
		
	System.out.println("Type a number: ");
	int number = new Scanner(System.in).nextInt();
	int sum = sumDigitsC(number);
	System.out.println("The sum of digits is: "+ sum);
	
	/* Lesson0088
	 * Java exercises 12 - Sum of all digits III (rescursivity)
	 * 
	 * Recursive method
	 * 
	 */
	}
}
