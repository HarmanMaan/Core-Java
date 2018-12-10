package Collection_FW;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_Hashset {

	public static void main(String[] args) {

		// Duplicates are not not allowed
		// Insertion order is preserved, point to next 
		// Null value is allowed only once
		// each object have its own hashcode
		// linked as doublilinked list
		// Child class if Hashset

		LinkedHashSet hs = new LinkedHashSet();

		hs.add("One");
		hs.add("two");
		hs.add("Three");
		hs.add("four");
		hs.add("One"); // duplicate not added, returned false

		System.out.println(hs);
		
		HashSet hs1 = new HashSet(20); // capacity of hashset = 20
		// HashSet hs2= new HashSet(20, 0.5); // Capacity = 20 , loadfactor =m 50 %
		// HashSet hs3= new HashSet(A); // Add other collection object of any list
	}

}
