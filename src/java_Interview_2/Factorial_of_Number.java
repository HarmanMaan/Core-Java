package java_Interview_2;

public class Factorial_of_Number {

	// using Recursion

	public int factorial(int number) {

		if (number == 0) {

			return 1;
		}

		int result = number * factorial(number - 1);  // see this video again 

		return result;

	}

	public static void main(String[] args) {

		Factorial_of_Number f = new Factorial_of_Number();

		System.out.println(f.factorial(5));

		int result = f.factorial(4);
		System.out.println(result);

		// without using Recursion

		int num = 4;
		int factorial = 1;

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
