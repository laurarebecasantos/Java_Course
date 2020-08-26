package io.github.laurarebecasantos.lesson0082;

import java.util.Scanner;

class Lesson0082 {

	public static void main (String[] args) {
		
		
	/*
	 * Rewrite the following code to use as few lines as possible: Grades): Stacking
	 * lines does not solve the problem. The following code is not simplification
	 * but confusion: int x = 0; x = System.out.println ("Enter a number");
	 * 
	 * Write in such a way as to use only 4 lines
	 * 
	 * Source code: Scanner in = new Scanner(System.in);
	 * 
	 * System.out.println("Simplificando expressões para reduzir o número de linhas"
	 * ); int x = 0; x = in.nextInt(); if(x &gt; 10){
	 * System.out.println("O número digitado é maior do que 10"); }else{
	 * System.out.println("O número digitado é menor do que 10"); }
	 */

	Scanner in = new Scanner(System.in);

	System.out.println("Simplifying expressions to reduce the number of lines.\nImput a number: ");
	int x = in.nextInt();
	String c = (x > 10) ? "bigger" : "smaller";
	System.out.printf("The number entered is %s than 10", c); 
		
	/* 
	System.out.println("Simplifying expressions to reduce the number of lines.\nImput a number: ");
	System.out.printf("The number entered is " +((new Scanner(System.in).nextInt() > 10) ? "bigger" : "smaller")+ " than 10");
	*/
	
	/*
	 * Lesson0082
<<<<<<< HEAD
	 * Java exercises 05 - Simplifying the code
	 * 
	 * if ternary
	 * printf %s
=======
	 * Java exercises 06 - Simplifying the code
	 * 
	 * if ternary
	 * printf(%s)
>>>>>>> 532b515... Java exercises 06 - Simplifying the code
	 * \n
	 * 
	 */

	}

}