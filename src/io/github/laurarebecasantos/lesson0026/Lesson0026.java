package io.github.laurarebecasantos.lesson0026;

class Lesson0026 {

	public static void main(String[] args) {
		
		int i = 0;
		int y = 0;
		
		System.out.println("Pre increment: " + (++i));
		
		System.out.println("After increment: " + (y++));
		i = 0;
		System.out.println("Pre decrement: " + (--i));
		y = 0;
		System.out.println("After decrement: " + (y--));
		
		int u = 0;
		
		//ps.: Revision
		u = u + 10; // Traditional way
		u += 10; // Assignment operator
		++u; // Increment operator
		
		/* Lesson0026
		 * Increment operators 
		 * 
		 * Adds one more to variable
		 * ++i : Pre increment / increments before instruction / before print.
		 * i++ : After increment / increments after instruction / after print.
		 * --i : Pre decrement / decrements before instruction / before print.
		 * i-- : After decrement / decrements after instruction / after print.
		 */
	}
}
