package io.github.laurarebecasantos.lesson0035;

import java.util.Scanner;

class Lesson0035 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Chose the option for your favorite day of the week: ");
		System.out.println("1.Monday 2.Tuesday 3.Fourth 4.Fifth 5.Friday 6.Saturday 7.Sunday");
		int number = in.nextInt();
		String day = (number==1) ? "Monday" :
					 (number==2) ? "Tuesday" :
					 (number==3) ? "Fourth" :
					 (number==4) ? "Fifth" :
					 (number==5) ? "Friday" :
					 (number==6) ? "Saturday" :
					 (number==7) ? "Sunday" :
							 "Invalid option";
		System.out.println("Your favorite day is: " + day);
		
	}

}