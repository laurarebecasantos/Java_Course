package io.github.laurarebecasantos.lesson0072;

class Overloading {
	void print() {

	}

	void print(int a) {
	}


	void print(String s) {
		System.out.println(s);
	}
	
	void print(String s1, String s2) {
		System.out.println(s1+" - "+s2);
	}
	void print(String s1, int i1) {
		System.out.println(s1+" - "+i1);
	}

}
public class Lesson0072 {

	public static void main(String[] args) {
/*
		Overloading overlod1 = new Overloading();
		Overloading overlod2 = new Overloading();
		Overloading overlod3 = new Overloading();
*/
		//New form of class instance with method flame.
		new Overloading().print("A String parameter");
		new Overloading().print("First parameter","Second parameter");
		new Overloading().print("Age is: " , 25);
		
		
		/* Lesson0072
		 * Overloading
		 * 
		 * Overload: combination of the function 
		 *     name with the list of parameters it should receive
		 * 
		 * Unique set in each function
		 * 
		 * Differentiation by data type.
		 * 
		 */
	}
}
