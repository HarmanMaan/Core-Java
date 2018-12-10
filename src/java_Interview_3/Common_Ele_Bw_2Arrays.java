package java_Interview_3;

public class Common_Ele_Bw_2Arrays {

	public static void main(String[] args) {

		int[] ar1 = { 1, 2, 3, 4, 5, 6 };
		int[] ar2 = { 3, 5, 1 };

		for (int i = 0; i < ar1.length; i++) {

			for (int j = 0; j < ar2.length; j++) {

				if (ar1[i] == ar2[j]) {

					System.out.println(ar1[i]);
				}
			}
		}

	}

}
