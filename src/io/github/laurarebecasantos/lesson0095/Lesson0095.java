package io.github.laurarebecasantos.lesson0095;

class Lesson0095 {

	interface Number{
		double getValue();
	}
	
	interface ValueNumeric{
		boolean Test(int n);
	}
	
	interface ValueNumeric2{
		boolean Test(int n, int n2);
	}
	
	public static void main (String[] args) {
		
		// Lambda expression used as a constant;
		Number n;
		n = () -> 555.11;
		System.out.println("Value constant: "+ n.getValue());
		System.out.println();
				
		// Lambda expression used with the Math class.
		Number n2 = () -> Math.random() * 100;
		System.out.println("Value random * 100: "+ n2.getValue());
		System.out.println();
				
		// Lambda expression used with Boolean value.
		ValueNumeric isPair = (int i) -> (i % 2) == 0; 			// Body: Value of i is pair? (i % 2) 
		System.out.println("Value boolean: "+ isPair.Test(89)); // Rest of division == 0?
		System.out.println("Value boolean: "+ isPair.Test(90));
		System.out.println();
		
		// Lambda expression used with Boolean value and variable type inference. 
		ValueNumeric2 isDiv = (x,  y) -> (x % y) == 0;
		System.out.println("Value boolean x and y: "+ isDiv.Test(10, 2));
		System.out.println("Value boolean x and y: "+ isDiv.Test(10, 3));
		
		/* Lesson0095
		 * Interface functional III
		 * 
		 * Interface double
		 * Interface boolean
		 * Class Math
		 * Variable type inference
		 * 
		 */
		
	}
}
