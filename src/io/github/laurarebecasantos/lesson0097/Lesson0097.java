package io.github.laurarebecasantos.lesson0097;

import java.util.Arrays;
import java.util.List;

class Lesson0097 {

	public static void main (String[] args) {
		
		// Before Java8
		List<String> list1 = Arrays.asList(
				"Santa Catarina",
				"Parana",
				"São Paulo",
				"Rio de Janeiro",
				"Brasilia");
		
		//  for(String s : list1)
		//	System.out.println(s);
		
		// Stream utilizing Expressions Lambda;
		// list1.forEach(x -> System.out.println(x));
		
		// Simplified form
		list1.forEach(System.out::println);
		
		/* Lesson0097
		 * Practicing Stream 
		 * 
		 * Expressions Lambda
		 * 
		 */
		
	}
	
}
