package java_Interview_1;

import java.util.Arrays;

public class Largest_Smallest_Array {

	public static void main(String[] args) {

		int Array[] = { -1, -5, 3, 34, 86, 99, 199, 57876 };

		int largest = Array[0];
		int smallest = Array[0];

		for (int i = 0; i < Array.length; i++) {

			if (Array[i] > largest) {
				largest = Array[i];

			} else if (Array[i] < smallest) {
				smallest = Array[i];
			}
		}

		System.out.println("The given Array is : " + Arrays.toString(Array));
		System.out.println("The largest number in Array is : " + largest);
		System.out.println("The smallest number in Array is : " + smallest);

	}

}
