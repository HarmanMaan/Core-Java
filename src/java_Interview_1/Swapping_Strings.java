package java_Interview_1;

public class Swapping_Strings {
	
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping");
		System.out.println("The value of a is : "+ a);
		System.out.println("The value of b is : "+ b);
		
		a = a + b ;  // HelloWorld
		
		System.out.println(a.length()); // 10 
		System.out.println(b.length()); // 5
		
		b = a.substring(0, a.length()-b.length()); // 0 , 5 => 0,1,2,3,4,5 as ends excluding 5th
		 
		a = a.substring(b.length()); // 5 - 1 => 0,1,2,3,4 as starts including 5th

		System.out.println("After Swapping");
		System.out.println("The value of a is : "+ a);
		System.out.println("The value of b is : "+ b);
	}

}
