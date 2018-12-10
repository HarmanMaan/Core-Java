package java_Interview_3;

public class Armstrong_Number {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int cube;
		int sum = 0;

		while (temp > 0) {

			cube = temp % 10;
			sum = sum + cube * cube * cube;
			temp = temp / 10;

		}

		if (sum == num) {

			System.out.println(num + " : is an Armstrong Number");
		} else {
			System.out.println(num + " : is not an Armstrong Number");
		}

	}

}
