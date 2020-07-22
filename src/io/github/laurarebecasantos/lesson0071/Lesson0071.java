package io.github.laurarebecasantos.lesson0071;

class Lesson0071 {
	
	public static void main (String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Rectangle r2;
		
		r2 = r1;
		r1.width = 1000;
		
		System.out.println(r1.width);
		System.out.println(r2.width);
		
		int i1 = 10;
		int i2 = i1;
		i2 = 20;
		
		System.out.println(i1);
		System.out.println(i2);
		
		/* Lesson71
		 * Keyword new
		 * 
		 * New Statement
		 * Reserved word *
		 * [Instantiating a class] Create a new object using a class.
		 * type name = NEW type();
		 * 
		 * 
		 */
	}

}
