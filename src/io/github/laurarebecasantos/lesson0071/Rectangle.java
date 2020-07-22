package io.github.laurarebecasantos.lesson0071;

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
