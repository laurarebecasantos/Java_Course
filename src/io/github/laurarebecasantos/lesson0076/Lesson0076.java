package io.github.laurarebecasantos.lesson0076;

class Window{
	int height;
	int width;
	
	Window(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	void print() {
		System.out.println("width: "+width+" height: "+height);
	}
	
	Window(){ //Overloading
		this(100,100); //invokes the other constructor
		System.out.println(width);
	}
}

public class Lesson0076 {

	public static void main (String[] args) {
		
	Window w = new Window();
	w.print();
	
	
	/* Lesson0076
	 * Keyword 'this'
	 * 
	 * This is used to distinguish the class variable from the parameter.
	 * this.height == variable of class
	 * this(100,100); invokes the other constructor 
	 * 
	 */
	}
}
