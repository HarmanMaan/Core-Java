package java_Interview_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorting_Map_values {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();
		hm.put("Banana", "Banana");
		hm.put("Pineapple", "Pineapple");
		hm.put("Apple", "Apple");
		hm.put("Guava", "Guava");

		for (Map.Entry<String, String> entry : hm.entrySet()) {

			System.out.println("Unsorted values : " + entry.getValue());

		}

		System.out.println("-------------------");
		
		Map<String, String> tm = new TreeMap<>(hm);
		
		for (Map.Entry<String, String> entry : tm.entrySet()) {

			System.out.println("Sorted values : " + entry.getValue());
		}
	}

}
