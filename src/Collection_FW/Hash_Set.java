package Collection_FW;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {

		// Duplicates are not not allowed
		// Insertion order is not preserved
		// Null value is allowed only once
		// each object have its own hashcode

		HashSet h = new HashSet();

		h.add("One");
		h.add("Two");
		h.add("Three");
		h.add("Four");
		h.add("One"); // duplicate not added,  returned false

		System.out.println(h);

		HashSet h1 = new HashSet(20); // capacity of hashset = 20
		// HashSet h2= new HashSet(20, 0.5); // Capacity = 20 , loadfactor =m 50 %
		// HashSet h3= new HashSet(A); // Add other collection object of any list

	}

}
