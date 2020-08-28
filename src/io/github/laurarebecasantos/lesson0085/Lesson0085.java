package io.github.laurarebecasantos.lesson0085;

import java.util.Scanner;

class Lesson0085 {

	public static void main(String[] args) {

		/*
		 * Make a program that shows the sum of all numbers in the range determined by
		 * the user. Then, ask the user to set the start of the count and then ask the
		 * user to inform the end.
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Informe o inicio do intervalo: ");
		int inicio = in.nextInt();
		System.out.println("Informe o fim do intervalo: ");
		int fim = in.nextInt();
		
		int loop = inicio;
		int sum = inicio;
		
		while(loop<fim) {
			loop++;
			sum+=loop;
		}
		System.out.println(sum);
		
		
		/* Lesson0085
		 * Java exercise 09 - Sum of all numbers in a range
		 * 
		 * while
		 * increment
		 * 
		 */
	}

}
