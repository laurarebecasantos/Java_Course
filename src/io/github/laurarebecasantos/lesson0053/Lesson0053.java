package io.github.laurarebecasantos.lesson0053;

class Lesson0053 {
	
	public static void main(String[] args) {
		
		int[][] table = new int[2][9];
		table[0][0] = 1;
		table[0][1] = 2;
		table[0][2] = 3;
		table[0][3] = 4;
		table[0][4] = 5;
		table[0][5] = 6;
		table[0][6] = 7;
		table[0][7] = 8;
		table[0][8] = 9;
		
		
		//System.out.println(table[0][0]);
		//System.out.println(table[1][0]);
		//System.out.println(table[0].length);
		
		for(int x=0; x<table[0].length; x++) {
			System.out.println(table[0][x]);
			
		}
		/* Lesson0053
		 * Multidimensional arrays II
		 * 
		 * Printing all the values of the first position.
		 * 
		 */
		
	}
	
}
