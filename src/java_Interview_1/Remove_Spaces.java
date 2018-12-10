package java_Interview_1;

import org.apache.commons.lang3.StringUtils;

public class Remove_Spaces {

	public static void main(String[] args) {

	 String str = "    Selenium      with    Java      ";
	 
	 System.out.println(str.trim());
	 
	 String str1 = StringUtils.normalizeSpace(str);
	 System.out.println(str1);
		
	}

}
