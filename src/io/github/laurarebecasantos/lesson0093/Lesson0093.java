package io.github.laurarebecasantos.lesson0093;

class Lesson0093 {
 
	interface Number {
		double getValue();
	}
	
	public static void main(String[] args) {
		
		Number n;
		n = () -> 333.11;
		
		System.out.println( n.getValue());
		
	}
	
	/* Lesson0093
	 * Interface functional
	 * 
	 * The lambda expression infers the return type automatically. 
	 * Therefore, it is not possible for the return to be different than double
	 */
	
}
