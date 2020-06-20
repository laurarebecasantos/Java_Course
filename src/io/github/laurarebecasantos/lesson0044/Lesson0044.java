package io.github.laurarebecasantos.lesson0044;

class Lesson0044 {
	
	public static void main(String[] args) {
		
		int[] list;
		list = new int[10];
		
		System.out.printf("%s%10s\n", " _______", "________ ");
		System.out.printf("%s%10s\n", "|Indice ", "| Valores|");
		System.out.printf("%s%10s\n", "|-------", "|--------|");
		

		for (int i=0; i<=9; i++) {
			System.out.printf("|%5d%s%7d |\n",i, "  |", list[i]);
		}
		System.out.printf("%s%10s\n", "|-------", "|--------|");

		
		
		/* Lesson0044
		 * Array IV	
		 * 
		 * Continuing previous example.
		 * 
		 */
		
	}

}
