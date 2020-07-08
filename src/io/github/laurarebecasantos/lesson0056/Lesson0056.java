package io.github.laurarebecasantos.lesson0056;

class Lesson0056 {

	public static void main(String[] args) {

		int[] list = new int[10];

		list[0] = 125;
		list[1] = 5487;
		list[2] = 45;
		list[3] = 457;
		list[4] = 887;
		list[5] = 1;
		list[6] = 4087;
		list[7] = 1287;
		list[8] = 5456;
		list[9] = 789841;
		
		 //print average arithmetic: 
		double sum = 0; 
		for (int item : list) {
			sum +=item; 
			} 
		double average = sum / list.length;
		 System.out.printf("This average arithmetic is: %f \n", average);
		
		
		// print smaller and biggest value in the list:
		int smaller = 0;
		int bigger = 0;
		for (int item : list) {
			if (item < smaller || smaller == 0)
				smaller = item;
			if (item > bigger)
				bigger = item;
		}
		System.out.printf("The smaller value in the list is: %d \n", smaller);
		System.out.printf("The biggest value in the list is: %d", bigger);
		
		/* Exemple of teacher:
		int soma = 0;
		for (int item : list) {
			soma += item;
		}
		float media = (float)soma / list.length;
		System.out.println("A media aritmetica é: " + media);
		*/
		
		/* Lesson0056
		 * 
		 * Printing average arithmetic with FOR EACH
		 * Print smaller and biggest value in the list with FOR EACH
		 */
	}
}
