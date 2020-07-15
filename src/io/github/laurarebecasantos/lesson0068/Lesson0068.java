package io.github.laurarebecasantos.lesson0068;

class Calculation {
	
	 void sum(int number1, int number2) { //Creating the method with the parameters
		System.out.println( number1 + number2);
	}
}


public class Lesson0068 {

	public static void main(String[] args) {
	Calculation cal = new Calculation();
	cal.sum(5, 25); //Invoking the method with the arguments
	
	
	/* Lesson0068
	 * Parameters and Arguments
	 * 
	 * A method takes parameters.
	 * When invoking a method, we pass arguments.
	 * 
	 * [type] [name] ([parameter1],[parameter2]){}
	 * 
	 */
	
	}
	
}
