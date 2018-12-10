package basicJava;

public class IfElseConcept {
	
	public static void main(String[] args) {

		int a = 50;
		int b = 40;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a ");
		}

		// Comparison operators : <, >, <=, >=, ==, !=
		int c = 10;
		int d = 20;

		if (c == d) {
			System.out.println("c is equal to d");
		} else {
			System.out.println("c is not equal to d");
		}

		// Nested if : to find te greatest of 3 numbers

		int x = 100;
		int y = 200;
		int z = 300;

		if (x > y & x > z) {    // false & false = false
			System.out.println("x is greater than y and z");
		} else if (y > z) {
			System.out.println("y is greater than x and z");
		} else {
			System.out.println("z is greater than x and y");
		}

	}

}
