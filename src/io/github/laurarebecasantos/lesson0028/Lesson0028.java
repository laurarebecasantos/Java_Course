package io.github.laurarebecasantos.lesson0028;

import java.util.Scanner;

class Lesson0028 {

	public static void main(String[] args) {
		
		
		
		int operation = 0;
		double n1, n2, result;
		
		Scanner in = new Scanner(System.in);
		
		int tie = 0;
		do {
			
		System.out.println("*** Calculator 1.2 ***");
		System.out.println(" ");
		System.out.println("Insert a number for option mathematical: ");
		System.out.println("1. Sum " + "2. Subtract " + "3. Multiplication " + "4. Division");
		System.out.println(" ");
		
	
		operation = in.nextInt();
		while(operation > 4 || operation == 0) {
			System.out.println("Enter one of the four options above: ");
			operation = in.nextInt();
			
		}

			System.out.println(" ");
					
			switch(operation) {
			
			case 1 : 
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 + n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
			break;
			case 2 :
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 - n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
			break;
			case 3 :
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 * n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
			break;
			case 4 :
			System.out.println("Digit a number: ");
			n1 = in.nextDouble();
			System.out.println("Please, digit a second number: ");
			n2 = in.nextDouble();
			result = n1 / n2 ;
			System.out.println("The result is: " + result);
			System.out.println(" ");
			break;
			}
			
		tie = tie + 1;
		System.out.println("Number of calculations: " + tie);
		System.out.println(" ");
		
		}while(tie < 100); 
		
		
		/* Lesson0028
		 * Calculator Do/While v2.0
		 * 
		 * 
		 */
		
		
	}
}
