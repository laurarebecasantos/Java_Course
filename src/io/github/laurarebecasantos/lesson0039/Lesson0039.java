package io.github.laurarebecasantos.lesson0039;

class Lesson0039 {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i<10; i++) { if(true) continue;
		 * 
		 * }
		 */

		/*
		 * System.out.println("I will print the even values from 0 to 10: "); for (int
		 * i=0; i<=100; i++) { if (i%2 == 0) System.out.println(i); else continue;
		 * System.out.println("-"); System.out.println("-"); System.out.println("-"); }
		 * 
		 */

		System.out.println("I will print the even values from 0 to 10: ");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
			else
				continue;
		int a = 0, soma = 0;
		while(a<i) {
			a++;
			soma += a;
		}
		
		System.out.println("The sum of all numbers is: " + soma);
		}
	}

	/*
	 * Lesson0039 Continue instruction
	 * 
	 * formula to know if the value of the variable is divided by 2, and is even or
	 * not (1%2==0)
	 * 
	 * executing the loop internally and the loop adds up all the numbers until a is less than i, but only if the number is even, even if the instruction continues, does it end execution.
	 * 
	 */
}
