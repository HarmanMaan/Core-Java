package java_Interview_1;

public class Practice {
	
	public static void main(String[] args) {
		
		
		int a = 0 ;
		int b = 1 ;
		int c = 1 ;
		int count = 10 ; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for (int i = 2; i < count ; i ++ ) {
			
			int d = b + c ;
			
			b = c ;
			c = d ;
			System.out.println(d);
		}
	} 
			
			
		}
		
	


