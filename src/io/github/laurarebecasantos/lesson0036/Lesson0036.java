package io.github.laurarebecasantos.lesson0036;

class Lesson0036 {
	public static void main(String[] args) {
		
		//looping for:
		for (int i = 0; i<10; i++) {
			if (true)
				break;
		}
		
		//looping while:
		int i = 10;
		while(i<100) {
			i++;
			if(true)
				break;
		}
		
		//Using the switch statement
		int dia = 2;
		switch (dia) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Invalid day");
		}
		
		//instruction block label with
		block:{
			System.out.println("1");
			if(true) 
				break block;
			System.out.println("5");
		}
		
		
		/* Lesson0036
		 * Break instruction
		 * 
		 * To end a repeat loop
		 * 
		 */
	}

}
