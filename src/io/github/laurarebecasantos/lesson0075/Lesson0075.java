package io.github.laurarebecasantos.lesson0075;

class Window {
	boolean b;
	double d;
	float f;
	
	int height;
	int width;
	
	Window(int h, int w){
		height = h;
		width = w;
	}
	
	void print(){
		System.out.println("This is width of window: "+width+" And is height of window: "+height);
		System.out.println("Boolean: "+b);
		System.out.println("Double: "+d);
		System.out.println("Float: "+f);
		
	}
	
	Window(){
		System.out.println(width);
	}
}


public class Lesson0075 {
	
	public static void main (String[] args) {
		
		//Window w = new Window(250,300);
		//w.print();
		Window w = new Window();
		w.print();
		
		
		/* Lesson0075
		 * Initializing objects
		 * 
		 * Overloading method.
		 * 
		 */
	}

}
