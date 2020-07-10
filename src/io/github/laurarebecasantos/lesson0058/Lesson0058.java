package io.github.laurarebecasantos.lesson0058;

class Lesson0058 {

	public static void main(String[] args) {

		

		int[][] table = new int[10][10];
		for (int x = 0; x < table.length; x++) {
			String str = "";
			for (int y = 0; y < table.length; y++) {
				table[x][y] = (3 * (x + 1) + (y * y));

				if (y < 9)
					str += table[x][y] + ",";
				else
					str += table[x][y];

			}

			System.out.println(str);
		}

		/*
		 * Lesson0058 
		 * Matrix function
		 * 
		 * vetor [x][y]
		 * 
		 * The matrix receives function values and stores them.
		 * The if / else conditions the printing of the stored values.
		 * 
		 */
	}

}
