package java_Interview_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input_From_Users {

	public static void main(String[] args) throws IOException {

		// Using buffered reader class to take String input

		String str = "";

		InputStreamReader in = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(in);

		str = br.readLine();

		System.out.println("Please enter a String : " + str);
		
		
		// using scanner class to take Number input
		
		int i = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		i = sc.nextInt();
		
        i = Integer.parseInt(sc.nextLine());	
        
		System.out.println("Please enter a number : " + i);
		
		sc.close();
		
		
		// using scanner class to take String input
		
//				String str2 = "" ;
//				
//				Scanner sc2 = new Scanner(System.in);
//				
//				str2 = sc2.nextLine();
//				
//				System.out.println("Please enter a String : " + str2);
//				
//				sc2.close();

	}

}
