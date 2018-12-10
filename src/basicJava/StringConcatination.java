package basicJava;

public class StringConcatination {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double c = 12.33;
		double d = 10.77;

		System.out.println(a + b);
		System.out.println(x + y);

		System.out.println(a + b + x + y); // Execution always starts from left to right >>>>
		System.out.println(x + y + a + b);

		System.out.println(x + y + (a + b));// But in this case brackets are executed first
		System.out.println(x + y + a + b + x + a + b + y);
		System.out.println(a + b + x + y + a + x + b + y);

		System.out.println(c + d);
		System.out.println(c + d + x + y + a + b);
		System.out.println(c + x + d + y + a + b);

		System.out.println("Hello World");
		System.out.println("The value of a is :" + a); // 100
		System.out.println("The value of b is :" + b); // 200
		System.out.println("The avle of a and b is :" + (a + b)); // (300)

	}

}
