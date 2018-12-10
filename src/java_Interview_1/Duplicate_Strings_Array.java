package java_Interview_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_Strings_Array {

	public static void main(String[] args) {

		String strArray[] = { "JAVA", "JavaScript", "C", "Python", "Ruby", "JavaScript","Ruby"};

		// There different ways to find duplicate element

		// 1 . by comparing all elements (Quite slow for big numbers e.g. Million
		// elements in array)

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {

				if (strArray[i].equals(strArray[j])) {

					System.out.println("Duplicate element is : " + strArray[i]);
				}
			}
		}
		System.out.println("*********************");

		// 2. using Hashset , doesn't allow duplicate values

		Set<String> hs = new HashSet<String>();

		for (int i = 0; i < strArray.length; i++) { // simple for loop

			if (hs.add(strArray[i]) == false) {

				System.out.println("Duplicate element is : " + strArray[i]);
			}
		}

		Set<String> hs1 = new HashSet<String>();

		for (String ele : strArray) { // using For each loop
			if (hs1.add(ele) == false) {
				System.out.println("Duplicate element is : " + ele);
			}
		}

		System.out.println("*********************");
		
		// 3. using hashmap (key, value) pair 
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		for ( String ele : strArray) {
			Integer count = hm.get(ele);
			if (count == null ) {
				
				hm.put(ele, 1);
			}
			else {
				hm.put(ele, ++count);
			}
		}
			
			for(HashMap.Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue()>1) {
				
				System.out.println("Duplicate element is :"+entry.getKey());
				
			    }
			}
		}

	}


