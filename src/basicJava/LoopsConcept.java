package basicJava;

public class LoopsConcept {

	public static void main(String[] args) {

		// ******Print 1 to 10********

		// while loop :
		// dis-advantage of while loop is that it will generate infinite loop if you
		// don't give incremental/decremental part.

		int i = 1; // initialization
		while (i <= 10) { // condition
			System.out.println(i);
			i++; // OR i=i+1 // incremental/decremental
		}
		System.out.println("********************************");

		// for loop :

		for (int j = 1; j <= 10; j++) { // initialization, condition, increment
			System.out.println(j);
		}

		System.out.println("********************************");

		// Print : 10 9 8 7 6 5 4 3 2 1

		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}

		System.out.println("********************************");

		// Print : 10 to -10

		for (int k = 10; k >= -10; k--) { // -1 > -10 true
			System.out.println(k);
		}

	}

}
