package java_Interview_2;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {

		int[] ar = new int[5];
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;
		ar[3] = 4;
		ar[4] = 5;

		System.out.println(Arrays.toString(ar));

		System.out.println("Before reversing the Array");
		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);
		}

		System.out.println("After reversing the Array");
		for (int i = ar.length - 1; i >= 0; i--) {

			System.out.println(ar[i]);

		}
		
		// Taking size and elements from user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of second Array ");
		int j = sc.nextInt();
		
		int [] a = new int [j];
		
		System.out.println("Enter the numbers in Array");
		for (int i = 0 ; i < a.length ; i++) {
			
			a[i]= sc.nextInt();
		}
		
		System.out.println("Reverse order of Array");
		
		for (int i = a.length-1 ; i >=0 ; i--) {
			
			System.out.println(a[i]);
		}
		
		sc.close();

	}

}
