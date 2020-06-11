package io.github.laurarebecasantos.lesson0037;

class Lesson0037 {

	public static void main(String[] args) {

		
		for(int x=0; x<100; x++) {
			if(x>75)
			break;
			System.out.println(x);
		}
		
		labelForX: for(int x=0; x<10; x++) {
			if(x==5)
				break;
			System.out.println(x);
			labelFori: for(int i=0; i<10; i++) {
				System.out.println("The value of x is "+x+" and i is: " + i);
				if(i==5 && x==3)
					break labelForX ;
			}
		}
		
		/*
		 * Lesson0037
 		 * Using the break to stop the looping
 		 * 
 		 * Loop within loop, where the inner 
 		 * loop to the outer loop.
		 * 
		 */

	}

}
