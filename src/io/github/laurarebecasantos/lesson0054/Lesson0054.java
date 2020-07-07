package io.github.laurarebecasantos.lesson0054;

class Lesson0054 {

	public static void main(String[] args) {
		//int[][] table = new int[2][2];
		int [][] table = {{1,2,3},{4,5,6},{7,8,9}};		
		
		for(int x=0; x<table[0].length; x++) {
			for(int y=0; y<table[1].length; y++)
			System.out.print(table[x][y]+" ");
			System.out.println();

			
		}
		
		/* Lesson0054
		 * Multidimensional arrays III
		 * 
		 * Printing all values for all positions.
		 * 
		 * table [2]x[2]
		 * int [][] table = {{},{},{}};
		 */
	}
}
