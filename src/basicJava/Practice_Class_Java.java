package basicJava;



public class Practice_Class_Java {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,5,6,8};
		
		int firstsum = 0;
		int secondsum = 0;
		for(int i = 0 ; i < ar.length; i++) {
			
			firstsum= firstsum + ar[i];
		}
		
		
		for (int j = 1 ; j <=8 ; j++) {
			
			secondsum=secondsum+j;
		}
		
		int missingNumber = secondsum- firstsum;
		
		System.out.println("The missing num is "+missingNumber);
		
	}

}
