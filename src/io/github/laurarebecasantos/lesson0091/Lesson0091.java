package io.github.laurarebecasantos.lesson0091;

class Lesson0091 {

	public static void main(String[] args) {
		
		
		System.out.println("*** Test start ***");
		
		//Anonymous implementation of the Runnable class
		Runnable r1 = new Runnable() { //Instantiating the Runnable class;
			@Override
			public void run() {
				System.out.println("Studying the lambda expression 1");
				
			}
		};
		
		// Creating the Runnable variable;
		Runnable r2;
		r2 = () // List of arguments, whether or not they have arguments.
				-> // Arrow indicates that we are working with the lambda expression.
				System.out.println("Studying the lambda expression 2"); // Body.
		
		r1.run();
		r2.run();
		
		/* Lesson0091
		 * Expression Lambda II
		 * 
		 * Practing class and variable Runnable.
		 * 
		 */
	}

}
