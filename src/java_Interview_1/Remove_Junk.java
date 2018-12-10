package java_Interview_1;

public class Remove_Junk {

	public static void main(String[] args) {

		String str = "^&$%$&^$%  Selenium ><<?>;:[{}+)) With *%^&$% JAVA 0123456789" ;
		String str1 = "^&$%$&^$%  Selenium ><<?>;:[{}+)) With *%^&$% JAVA 0123456789" ;
		String str2 = "^&$%$&^$%  Selenium ><<?>;:[{}+)) With *%^&$% JAVA 0123456789" ;
		String str3 = "^&$%$&^$%  Selenium ><<?>;:[{}+)) With *%^&$% JAVA 0123456789" ;
		
		// by using Regular expression = [^a-zA-Z0-9]
		
        str = str.replaceAll("[^a-zA-Z0-9]", ""); 
        System.out.println(str);
        
        str1 = str1.replaceAll("[^ a-zA-Z ]", ""); // to avoid removing spaces we give space after ^
        System.out.println(str1);
        
        str2 = str2.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(str2);
        
        str3 = str3.replaceAll("[ a-zA-Z]", ""); // for removing spaces we give space after in [anywhere here]
        System.out.println(str3);
	}

}
