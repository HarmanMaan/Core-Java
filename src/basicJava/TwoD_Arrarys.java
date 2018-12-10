package basicJava;

public class TwoD_Arrarys {

	public static void main(String[] args) {

		String x[][] = new String[3][5];

		System.out.println(x.length); // number of rows : 3
		System.out.println(x[0].length); // number of columns : 5 & x[1], x[2]

		System.out.println("********************");

		// First row
		x[0][0] = "A1";
		x[0][1] = "B1";
		x[0][2] = "C1";
		x[0][3] = "D1";
		x[0][4] = "E1";

		// Second row
		x[1][0] = "A2";
		x[1][1] = "B2";
		x[1][2] = "C2";
		x[1][3] = "D2";
		x[1][4] = "E2";

		// Third row
		x[2][0] = "A3";
		x[2][1] = "B3";
		x[2][2] = "C3";
		x[2][3] = "D3";
		x[2][4] = "E3";

		System.out.println(x[0][3]);
		System.out.println(x[1][4]);
		System.out.println(x[2][2]);

		System.out.println("********************");

		// print all the values of 2-D array : double for loop
		// for row & column
		// this is how loop will work
		// row=0, column = 0 to 4
		// row=1, column = 0 to 4
		// row=2, column = 0 to 4

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
			}

		}
	}

}
