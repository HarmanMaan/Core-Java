package java_Interview_2;

public class Fibonnaci_Series {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 1;
		int count = 10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		for (int i = 0; i < count; i++) {
  
			int d = b + c ;
			
			System.out.println(d);
			b = c ;
			c = d ; 
		}
		
		System.out.println("------------------------------");
		
		int [] fib = new int[count];
		
		fib[0] = 0;
		fib[1] = 1;
		
		System.out.println(fib[0]);
		System.out.println(fib[1]);

		for (int i = 2; i < 10; i ++) {
			
			fib [i] = fib[i-1]+ fib[i-2];
			
			System.out.println(fib[i]);
		}
		
		// using for each loop
		System.out.println("------------------------------");

		for(int ele : fib) {
			
			System.out.println(ele);
		}

		
		
		
		
	}

}
