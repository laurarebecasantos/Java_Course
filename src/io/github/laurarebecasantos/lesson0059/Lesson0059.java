package io.github.laurarebecasantos.lesson0059;

class Lesson0059 {

	public static void main(String[] args) {

		// double[][] table = new double[5][6];
		double[][] table = {

				{ 434, 45, 912, 42, 54, 0 }, { 23.8, 973.3, 254.8, 744.2, 3.74, 0 },
				{ 23.8, 973.3, 254.1, 744.2, 3.74, 0 }, { 53.52, 67, 873, 245.9, 54.12, 0 },
				{ 234.25, 54.2, 82.0, 745.2, 82, 0 } };

		double allSum = 0;
		for (int x = 0; x < table.length; x++) {

			for (int y = 0; y < table.length; y++) {
				table[x][5] += table[x][y];
			}
			allSum += table[x][5];
		}

		for (int x = 0; x < 5; x++) {
			String str = "";
			for (int y = 0; y < 6; y++) {
				if (y < 5)
					str += table[x][y] + ", ";
				else
					str += table[x][y];
			}
			System.out.println(str + "\n");

		}
		System.out.println("The all sum is: " + allSum);
		
		/*
		 * Lesson0059 
		 * Manipulating spreadsheets
		 * 
		 * Adding the total of all columns (All sum)
		 * 
		 */

	}

}
