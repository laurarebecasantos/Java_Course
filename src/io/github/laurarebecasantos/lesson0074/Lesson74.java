package io.github.laurarebecasantos.lesson0074;

class Window{
	
	int width, height;
	Window(int w, int h){
		width = w;
		height = h;
	}
	
	void print(){
		System.out.println("height = "+height+", the width = "+width);
	}
	
}


public class Lesson74 {
	
	public static void main (String[] args) {
		
		Window w = new Window(250,250);
		w.print();
	
		
		/* Lesson0074
		 * Builders
		 * 
		 * Creating a class with a constructor
		 * Once the class has a defined constructor, it is only possible to instantiate it after passing the value of the parameters.
		 * 
		 */
		
		
	}

}
