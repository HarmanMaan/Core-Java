package basicJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList is dynamic in nature we can add values when required
		// warning signs are coming because no generic are defined

		ArrayList ar = new ArrayList();

		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2

		System.out.println(ar.size());

		System.out.println("******************");

		ar.add(400); // 3
		ar.add(500); // 4

		System.out.println(ar.size());

		System.out.println("******************");

		// We can add any type of values in ArrayList
		// int, Char, String, Boolean

		ar.add("Hello World"); // 5
		ar.add('A'); // 6
		ar.add(12.33); // 7
		ar.add(true); // 8

		System.out.println(ar.size()); // Size 9

		ar.remove(3); // OR ar.remove(ar.get(3)) to remove from List

		System.out.println(ar.size()); // Size 8

		System.out.println("******************");

		// To print the values of individual by indexes

		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(5));
		System.out.println(ar.get(7));

		System.out.println("******************");

		// To print all values of the ArrayList

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

			// When we specify any generic , then we can add only that datatype
			// here Ex . int

			ArrayList<Integer> ar1 = new ArrayList<Integer>();
			ar1.add(100);
			// ar1.add(" String"); // Not able to add any other datatype

			ArrayList<String> ar2 = new ArrayList<String>();
			ar2.add("Hello World");
			// ar2.add(100); // only String here

		}

	}
}
