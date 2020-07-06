package io.github.laurarebecasantos.lesson0051;

import java.util.Scanner;

class Lesson0051 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double[] arrayGrades = new double[4];
		double sumGrades = 0;

		for (int i = 0; i < arrayGrades.length; i++) {
			System.out.printf("Insert note %d : ", i + 1);
			arrayGrades[i] = in.nextDouble();
			sumGrades += arrayGrades[i];
		}

		double average = sumGrades / arrayGrades.length;

		System.out.printf("The avarage of grades is: %f", average);

		/* Exemple of teacher:
		 * 
		 * int[] nums = new int[5]; nums[0] = 9; nums[1] = 10; nums[2] = 5; nums[3] = 6;
		 * nums[4] = 7;
		 * 
		 * int media = 0; for(int i=0; i<nums.length; i++) media += nums[i];
		 * 
		 * float total = (float)media / nums.length;
		 * 
		 * System.out.println("A média é: " + total);
		 */
		
		/* Lesson0051
		 * Calculating average arithmetic 
		 * 
		 * Calculating the average of notes with array.
		 * 
		 */

	}
}
