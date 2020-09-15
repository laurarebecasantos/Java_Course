package io.github.laurarebecasantos.lesson0099;

import java.util.Arrays;
import java.util.List;

class Lesson0099 {
	
	public static void main(String[] args) {
		
		//External iteration
		List <String> item =
				Arrays.asList("Item1","Item2","Item3");
		/*
		 *for(int i=0; i<item.size(); i++) { // FOR
		 *	System.out.println(item.get(i));
		 *}
		 */
	   /*
		*for(String str : item) { //FOREACH
		*    System.out.println(str);
		*}
		*/
		
		//Internal iteration
		item.forEach((str) -> System.out.println(str));
		
		
		/* Lesson0099
		 * Internal iteration
		 * 
		 * Instruction block as parameter
		 * 
		 */
	}

}
