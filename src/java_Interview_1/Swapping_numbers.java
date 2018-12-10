package java_Interview_1;

public class Swapping_numbers {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println(x);
		System.out.println(y);
		System.out.println("----------");

		// Swapping using third variable
		int temp;
		temp = x;
		x = y; // x => 20
		y = temp; // y => 10

		System.out.println(x);
		System.out.println(y);
		System.out.println("----------");

		// without using third variable

		x = x + y; // x => 30
		y = x - y; // x => 20
		x = x - y; // y => 10

		System.out.println(x);
		System.out.println(y);
		System.out.println("----------");
		
		x = x * y ; // 200
		y = x / y ; // 10 
		x = x / y ; // 20
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------");
		
		x = x ^ y ; 
		y = x ^ y ; // 20 
		x = x ^ y ; // 10
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------");
	}

}
