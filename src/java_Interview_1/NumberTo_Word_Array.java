package java_Interview_1;

import java.util.Scanner;

public class NumberTo_Word_Array {

	public static void main(String[] args) {

		int i, digit1, digit2, digit3, digit4;

		String[] str1 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Tewelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] str2 = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		String[] str3 = { "Hundred", "Thousand" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number between 1 to 999 ");
		i = sc.nextInt();

		if (i < 1 || i >= 1000) {
			
			System.out.println("Your number is out of bound, please enter valid number");
			
		} 
	
		if (i >= 1 && i <= 19) {
			
			System.out.println(str1[i]);
			
		} else if (i >= 20 && i < 100) {

			digit1 = i / 10;
			digit2 = i % 10;
			
			System.out.println(str2[digit1] + " " + str1[digit2]);
			
		} else if (i >= 100 && i < 1000) {

			digit1 = i / 100; // str1
			digit2 = i % 100;
			digit3 = digit2 / 10; // str2
			digit4 = digit2 % 10; // str1
			
			System.out.println(str1[digit1]+" "+str3[0]+" "+str2[digit3]+" "+str1[digit4]);
		}

		sc.close();

	}

}
