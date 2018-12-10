package basicJava;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put(1, "One");
		h.put(2, "two");
		h.put(3, "Three");

		System.out.println(h.size());

		// Size is dynamic
		// We can use any Data type or combination also
		h.put(4, 400);
		h.put("A", "Hello");

		System.out.println(h.size());

		System.out.println("******************");

		// We can get values on based of keys entered
		// And we have to add keys as entered (i.e. DataTypes)
		System.out.println(h.get("A"));
		System.out.println(h.get(3));

		System.out.println("******************");

		// to specify generic
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		h1.put(1, "Hello");
		h1.put(2, "JAVA");
		// h1.put("C", 3); // we cannot change order of datatypes in generic
		System.out.println(h1.get(2));

		System.out.println("******************");

		Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();

		h2.put(1, 1000);
		h2.put(2, 2000);
		h2.put(3, 3000);

		System.out.println(h2.get(3));

	}

}
