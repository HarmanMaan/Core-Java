package java_Interview_2;

public class Perfect_Number {
	
	/*
	 * 1. A number is Perfect when sum of its divisors is equal to the number  
	 * 28=1+2+4+7+14=28
	 * 
	 * 2. A number is Abundant when sum of its divisors is greater to the number
	 * 12 =1+2+3+4+6 = 14
	 * 
	 * 3. A number is Deficient when sum of its divisors is less to the number
	 * 14 =1+2+7= 10
	 */
	
	private static boolean isperfect(int num) {

		int temp = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {

				temp = temp + i;
			}
			if (num == temp) {
				return true;

			}
		}

		return false;
	}

	public static void main(String[] args) {

		int num = 28;

		boolean b = isperfect(num);

		if (b) {
			System.out.println("The number " + num + " is a Perfect Number");
		} else {
			System.out.println("The number " + num + " is not a Perfect Number");
		}
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		int num2 = 12;
		int temp = 0;

		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {

				temp = temp + i;
			}
		}
		
		if (num2 == temp) {

			System.out.println("The number " + num2 + " is a Perfect Number");
		} else if (num2 < temp) {
			System.out.println("The number " + num2 + " is not a Abundant Number");
		} else if (num2 > temp) {
			System.out.println("The number " + num2 + " is not a Deficient Number");

		}

	}

}
