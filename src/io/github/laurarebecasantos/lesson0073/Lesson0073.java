package io.github.laurarebecasantos.lesson0073;

class Factorial {
	int fat(int f) {
		if(f<=1) //basic condition
			return 1;
	int r = fat(f-1)*f;
	return r;
	}
	
	
	
}

public class Lesson0073 {

	public static void main(String[] args) {

		System.out.println(new Factorial().fat(5));
		System.out.println(new Factorial().fat(6));
		
		
		/*
		 * Lesson073
		 * Recursion
		 * 
		 * Recursion: Method that calls itself. Recursion is the same situation where a
		 * routine is invoked itself.
		 * 
		 */
	}
}
