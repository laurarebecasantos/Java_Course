package io.github.laurarebecasantos.lesson0013;

import java.util.Scanner;

class Lesson0013 {

	public static void main(String[] args) {
		
		double operation= 0;
		double n1, n2, result;
		
		Scanner in = new Scanner(System.in);
		
		int tie = 0;
		while(tie < 100) {
			
		System.out.println("*** Calculator 1.2 ***");
		System.out.println(" ");
		System.out.println("Insert a number for option mathematical: ");
		System.out.println(" ");
		System.out.println("1. Sum " + "2. Subtract " + "3. Multiplication " + "4. Division");
		
		operation = in.nextInt();
		while(operation > 4 || operation == 0) {
			System.out.println("Enter one of the four options above: ");
			operation = in.nextInt();
		}

			System.out.println(" ");
					
		if(operation == 1){
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 + n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
		}
		
		if(operation == 2) {
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 - n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
		}

		if(operation == 3) {
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 * n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
		}
		
		if(operation == 4) {
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 / n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
		}
		
		tie = tie + 1;
		System.out.println("Number of calculations:" + tie);
		System.out.println(" ");
		
		}
		
		/* Lesson0013
		 * Creating calculator four operations
		 * Utiliting while/if
		 * 
		 */
		
	}
}

