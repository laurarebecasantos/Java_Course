package io.github.laurarebecasantos.lesson0016;

import java.util.Scanner;

class Lesson0016 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final double vsound = 340.28; // m/s
		int option = 0;
		double time = 0;
		
		
		int tie = 0;
		while(tie < 50) {
		
		System.out.println("*** Speed of sound ***");
		System.out.println(" ");
		System.out.println("Insert a number for option: ");
		System.out.println("1.meter, 2.kilometer, 3.Hectometer, 4.Decameter");
		option = in.nextInt();
		System.out.println(" ");

		while(option > 4 || option == 0) {
			System.out.println("You need to enter one of the four options above: ");
			option = in.nextInt();
		}
		
		System.out.println(" ");
		
		switch(option) {
		case 1 :
			System.out.println("Put space the time: ");
			time = in.nextDouble();
			time = time * vsound;
			System.out.println("The distance is: " + time +" meters traveled.");
			System.out.println(" ");
			break;
		case 2 :
			System.out.println("Put space the time: ");
			time = in.nextDouble();
			time = (time * vsound) / 1000;
			System.out.println("The distance is: " + time + " kilometers traveled.");
			System.out.println(" ");
			break;
		case 3 :
			System.out.println("Put space the time: ");
			time = in.nextDouble();
			time = (time * vsound)  / 100; 
			System.out.println("The distance is: " + time + " hectometers traveled.");
			System.out.println(" ");
			break;
		case 4 :
			System.out.println("Put space the time: ");
			time = in.nextDouble();
			time = (time * vsound) / 10;
			System.out.println("The distance is: " + time + " Decameters traveled.");
			System.out.println(" ");
			break;
		
		}
	}
		/* Lesson0016
		 * Utiliting constant FINAL
		 * Utiliting Switch/case for condition.
		 * Utiliting While for repetition
		 */
}
}
