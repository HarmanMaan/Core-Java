package java_Interview_2;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				System.out.println("Given number is " + num + " is not prime");
				break;
			}
		}
		if (prime == true) {
			System.out.println("Given number is " + num + " is prime");
		}
		sc.close();
	}
}
