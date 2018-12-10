package basicJava;

public class IncrementAndDcerementoperators {

	public static void main(String args[]) {

		// ++ : increment
		// -- : decrement
		// Only applied to Variables , not to numbers

		int i = 1;
		int j = i++; // post increment : First assign then increment

		System.out.println(i); // 2
		System.out.println(j); // 1
		System.out.println("********************************");

		int a = 1;
		int b = ++a; // pre increment : First increment then assign

		System.out.println(a); // 2
		System.out.println(b); // 2
		System.out.println("********************************");

		int e = 1;
		int f = e--; // post decrement : First assign then decrement

		System.out.println(e);// 0
		System.out.println(f);// 1
		System.out.println("********************************");

		int n = 1;
		int m = --n; // pre decrement : First decrement then assign

		System.out.println(n);// 0
		System.out.println(m);// 0
	}

}
