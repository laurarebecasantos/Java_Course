package io.github.laurarebecasantos.lesson0038;

class Lesson0038 {

	public static void main(String[] args) {

		label1: {
			labelIf2: if (true) {
				System.out.println("If instruction");
			}
			System.out.println("label 1 start");

			label2: {
				System.out.println("label 2 start");

				labe3: {
					System.out.println("label 3 start");
					labelIf1: if (true)

						break label2;
				}
				System.out.println("label 2 end");
			}
			System.out.println("label 1 end");
		}

		/*
		 * Lesson039 
		 * Other uses of the break statement
		 * 
		 * Any statement that contains a block can use the label.
		 * 
		 */

	}

}
