package io.github.laurarebecasantos.lesson0081;

import java.util.Scanner;

class Lesson0081 {

	public static void main(String[] args) {

		/*
		 * Develop a small login and password program. To do this, ask the user to enter
		 * your login and store what the user typed in a variable. Then, ask the user to
		 * enter their password and store it in another variable. Finally, make sure the
		 * login and password are the same as the ones you set.
		 * 
		 * Notes (s): 1) You can use your CPF name and password for your password
		 */
		
		Scanner in = new Scanner(System.in);
		
		
		String login = "laura";
		String password = "12345678910";
		
		System.out.println("Enter your login: ");
		String validLogin = in.nextLine();
		System.out.println("Enter your password: ");
		String validPass = in.nextLine();
		
		if(validLogin.equals(login) && validPass.equals(password)){
		System.out.println("Access allowed");
		}
		else {
			System.out.println("Access denied");
		}
		
		/*
		 * Lesson0081 Java exercises 05 - Login and password
		 * 
		 * String comparison
		 * Function .equals()
		 * if condition
		 * 
		 */

	}

}
