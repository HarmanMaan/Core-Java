package java_Interview_1;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int num = 12345;
		int reverse = 0;
		System.out.println(num);

		while (num != 0) {
			reverse = reverse * 10 + num % 10 ;
			num = num / 10;  
			
			// 12345 / 10 = 1234.5 and num is integer which will not store float value after decimal >> 1234
			
		}
		System.out.println(reverse);

	}

}
