package io.github.laurarebecasantos.lesson0100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Lesson0100 {
		
	public static void filter (List<String> list0, Predicate<String> condition) {
		//External iteration
		//for(String s: list0)
			//if(condition.test(s))
				//System.out.println(s);
		
		//Internal iteration
		//list0.stream().filter((str)->condition.test(str))
		//.forEach((str)->System.out.println(str));
		
		//Internal referencing iteration
		list0.stream().filter(condition::test)
					  .forEach(System.out::println);
	}
		
	public static void main(String[] args) {
			
			
			// Before Java8
			List<String> list1 = Arrays.asList(
				"Santa Catarina", "Parana",
				"São Paulo", "Rio de Janeiro", "Brasilia");
					
			System.out.println("1. States beginning with the letter S: ");
			filter(list1, (s)->s.startsWith("S"));
			System.out.println();
			
			System.out.println("2. States ending with the letter A: ");
			filter(list1, (s)->s.endsWith("a"));
			System.out.println();
			
			System.out.println("3. Print the entire list: ");
			filter(list1, (s)->true);
			System.out.println();
			
			System.out.println("4. Does not print the list: ");
			filter(list1, (s)->false);
			System.out.println();
			
			System.out.println("5. Prints names longer than ten characters: ");
			filter(list1, (s)->s.length()>10);
			System.out.println();
			
			/* Lesson0100
			 * Internal iteration II
			 * 
			 * Internal referencing iteration
			 * 
			 */
		
		
		
		
	}
}
