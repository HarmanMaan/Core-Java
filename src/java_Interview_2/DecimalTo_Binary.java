package java_Interview_2;

public class DecimalTo_Binary {

	public static void main(String[] args) {

		int num = 12;
		int index = 0;

		int[] ar = new int[25];

		while (num > 0) {

			ar[index++] = num % 2;
			num = num / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");

		}
	}

}
