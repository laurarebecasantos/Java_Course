package io.github.laurarebecasantos.lesson0084;

class Lesson0084 {

	public static void main(String[] args) {

		/*
		 * Make a program that shows the sum of all numbers in the range from 1 to 100.
		 */
		
		int sum=0;

		System.out.print("The sum of the first 100 numbers is: ");
		for(int x=1; x<=100; x++) 
			 sum += x;
			System.out.println(sum);
		
			
		System.out.println("The sum using the while statement: ");
		int sum1 = 0, x2 = 0;
		while(x2<=100) {
			sum1 += x2;
			x2++;
		}
		
		/* Lesson0084
		 * Java exercises 08 - Sum of 1 to 100
		 * 
		 * Using for
		 * Using assignment operator
		 * Using while
		 * 
		 */
		
	}

}
