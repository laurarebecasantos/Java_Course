package io.github.laurarebecasantos.lesson0047;

class Lesson0047 {

	
	public static void main(String[] args) {
		
		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[1] = 20;
		arrayInt[2] = 30;
		arrayInt[3] = 12;
		arrayInt[4] = 89;
		arrayInt[5] = 55;
		arrayInt[6] = 10;
		arrayInt[7] = 1;
		arrayInt[8] = 9;
		arrayInt[9] = 78;
		
		int sum = arrayInt[0]+arrayInt[1]+arrayInt[2];
		
		System.out.println("This sum of the first three elements is: " + sum);
		
		int sum2=0;
		for(int i=0; i<10; i++) {
			sum2 += arrayInt[i];
		}
		
		System.out.println("This sum off the all elements is: " + sum2);
		
		
		
		/* Lesson0047
		 * Manipulating array
		 * 
		 * Mathematical operations.
		 * creating an array with 10 positions.
		 * Adding the first three elements.
		 * Adding all the elements across the loop for.
		 */
		
	}
}
