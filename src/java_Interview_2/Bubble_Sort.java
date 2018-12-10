package java_Interview_2;

public class Bubble_Sort {

	public static void main(String[] args) {

		int[] ar = { 9, 7, 3, 5, 8, 6, 4 };

		System.out.println("Before Sorting");
		for (int i : ar) {
			System.out.println(i);

		}

		bubblesort(ar);
		
		System.out.println("After Sorting");
		for (int i : ar) {
			System.out.println(i);
		}

	}

	private static void bubblesort(int[] ar) {

		int temp = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] > ar[j]) {

					temp = ar[i];

					ar[i] = ar[j];

					ar[j] = temp;
				}
			}
		}
	}
}
