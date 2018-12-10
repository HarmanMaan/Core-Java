package java_Interview_1;

public class String_Manipulation {

	public static void main(String[] args) {

		String str = "To learn Selenium with Java";

		String str1 = "TO LEARN SELENIUM WITH JAVA";
		
		System.out.println(str.length()); // 27

		System.out.println(str.charAt(9)); // S

		System.out.println(str.indexOf("a")); // 0, 1, 2, 3, 4, 5 first occurrence => 5

		System.out.println(str.indexOf("a", str.indexOf("a") + 1)); // second occurrence => 24

		System.out.println(str.indexOf("a", str.indexOf("a", str.indexOf("a") + 1) + 1)); // Third occurrence => 26
		
		System.out.println(str.indexOf("Selenium")); // S starting alphabet => 9
		
		System.out.println(str.indexOf("Hello")); // if not present => -1
		
		System.out.println(str.toUpperCase()); // convert to upper case 
		
		System.out.println(str1.toLowerCase()); // convert to lower case
		
		System.out.println(str.replace(" ", "-")); // to replace anything space , character etc in a String
		
		System.out.println(str.replace(" ", "_"));
		
		
		// to split string and store in Array 
		// if the words are in next line then str.split"\n"
		
		String str3= "Hello_World_with_Java";
		String str3_Split [] =  str3.split("_"); // splitting the str3 and storing in Array[] 
		
		for(int i = 0 ; i < str3_Split.length; i++) {
			
			System.out.println(str3_Split [i]);
			
		}
		
		// Concatenation
		
		String s = "Hello";
		
		System.out.println(s.concat(" World"));
		
        // subString 
		
		System.out.println(str3.substring(6)); // including 6th character
        
		System.out.println(str3.substring(6, 11)); // starts including 6 BUT ends Excluding 11
		
	}

}
