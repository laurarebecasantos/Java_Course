package io.github.laurarebecasantos.lesson0069;
class Rectangle {
	public int width, height;
	
	public int totalArea() {
		return width * height;
	}
	
	public boolean isSquare() {
		if(width == height) 
			return true;
			else
				return false;
	}
}

public class Lesson0069 {

	public static void main(String[] args) {
		
		Rectangle square = new Rectangle();
		square.width = 100;
		square.height = 120;
		
		System.out.println(square.totalArea());
		System.out.println(square.isSquare());
		
		Rectangle square2 = new Rectangle();
		square2.width = 100;
		square2.height = 100;
		
		System.out.println(square2.totalArea());
		System.out.println(square2.isSquare());
		
		/* Lesson0069
		 * Return of values
		 * 
		 * Returning values via function.
		 * Using the return statement.
		 * 
		 */
	}
}
