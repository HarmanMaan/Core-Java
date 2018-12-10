package java_Interview_1;

public class Missing_Number_Array {

	public static void main(String[] args) {

		
		// Array should be sorted order
		
		/*
		 * int a[]= {1,2,3,5};
		 * 1+2+3+5 = 11
		 * 1+2+3+4+5 = 15 
		 * Missing number = 15-11 = 4
		 * */
		
		int a[]= {-2,-1,0,1,2,3,4,5,7,8,9,10};
		int sum = 0;
		for (int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i]; 
			
		}
			System.out.println(sum);
	
			
		int sum1 = 0;
		for (int j = -2 ; j <= 10; j++) {   // j = starting point -2 , 1 etc   & j <= last number
			
			sum1= sum1 + j;
			
		}
			
		System.out.println(sum1);
		
		
		System.out.println("The missing number is : "+ (sum1 - sum));

			
			
			
	}
}
