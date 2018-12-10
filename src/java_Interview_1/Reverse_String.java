package java_Interview_1;

public class Reverse_String {

	public static void main(String[] args) {

		String str = "Selenium with java";
		String revrese = "";
		
		System.out.println(str);
		
		for (int i = str.length() - 1; i >= 0; i--) {

			revrese = revrese + str.charAt(i);

		}
		System.out.println(revrese);
		
		System.out.println("**********************************");
		
		StringBuffer s = new StringBuffer();
	     s.append("Java");
		 System.out.println(s);
	     System.out.println(s.reverse());
		 
			
		System.out.println("**********************************");
	
		StringBuffer s1 = new StringBuffer("Python");
		s1.append(" Java");
		System.out.println(s1);
	    System.out.println(s1.reverse());
	
	}

}
