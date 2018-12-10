package basicJava;

public class ArraysConcept {

	public static void main(String[] args) {

		// array : to store similar data type values in a array variable

		// one dimensional arrays
		// lowest bound/index =0
		// upper bound/index= n-1 (where n is size of array)

		// dis- advantages of array:
		// 1. Arrays size is fixed -- static arrays
		// To overcome this problem we use --collections -- ArrayList, Hashtable etc --
		// Dynamic arrays
		// 2. Array stores only similar values/ data types
		// To overcome this problem we use -- Object arrays

		// 1. int array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i.length); // Length/size of array

		System.out.println("********************");

		System.out.println(i[3]);
		System.out.println(i[2]);
		// System.out.println(i[4]); // Array out of bound exception
		System.out.println(i[0]);

		System.out.println("********************");

		// for loop : To print all values of array

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("********************");

		// 2. double array

		double k[] = new double[3];
		k[0] = 11.33;
		k[1] = 33.44;
		k[2] = 55.66;

		System.out.println(k[0]);

		System.out.println("********************");

		// 3. char array

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'w';
		c[2] = 'A';

		System.out.println(c[2]);

		System.out.println("********************");

		// 4. boolean array

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);
		System.out.println(b[1]);

		System.out.println("********************");

		// String array :

		String s[] = new String[4];
		s[0] = "Harman";
		s[1] = "likes";
		s[2] = "Coding";
		s[3] = "Java";

		System.out.println(s.length);
		System.out.println(s[0]);

		for (int t = 1; t < s.length; t++) {
			System.out.println(s[t]);
		}

		System.out.println("********************");

		// Object Array (Class) -- we can store different data types/ values

		Object ob[] = new Object[6];
		ob[0] = 1;
		ob[1] = "Hello World";
		ob[2] = 12.33;
		ob[3] = 'A';
		ob[4] = true;
		ob[5] = "1/1/1990";

		System.out.println(ob.length);
		System.out.println(ob[1]);

	}

}
