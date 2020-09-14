package io.github.laurarebecasantos.lesson0094;

class Lesson0094 {
	
	interface Number{
		double getValue();
	}
	
	interface ValueNumeric{
		boolean Test(int n);
	}
	
	public static void main(String[] args) {
		
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
		
		
		/* Lesson0094
		 * Interface functional II
		 * 
		 * Interface double
		 * Interface boolean
		 * Class Math
		 * 
		 */
		
	}

}
