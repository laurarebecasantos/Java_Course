package io.github.laurarebecasantos.lesson0070;

class Rectangle {
	public int width, height;

	public int totalArea() {
		return width * height;
	}

	public boolean isSquare() {
		if (width == height)
			return true;
		else
			return false;
	}

}

public class Lesson0070 {

	public static void main(String[] args) {

		//Rectangle r1 = new Rectangle();
		
		Rectangle r1 = null;
		if(r1 != null)
			r1.isSquare();
		
		//NullPointerException
		
	     /* Lesson0070
		 * 
		 * Null Pointer Exception
		 * The class method cannot be called without the class being instantiated.
		 * Through a condition, the method is accessed without error, however, it shows if it is empty.
		 * 
		 */
		
	}
}
