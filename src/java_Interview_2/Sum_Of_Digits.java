package java_Interview_2;

public class Sum_Of_Digits {
	
	public static void main(String[] args) {
		
		int num = 555; 
		
		int sum = 0;
		
		while(num > 0) {
			
			int add = num % 10;
			
			sum = sum + add;
			
		    num = num / 10;
			
		}
		System.out.println(sum);
	}

}
