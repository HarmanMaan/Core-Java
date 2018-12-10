package Collection_FW;

import java.util.TreeSet;

public class Sorted_Navigable_TreeSet {

	public static void main(String[] args) {

		// Duplicates are not not allowed
		// Insertion order is not preserved
		// Null value is allowed only once
		// Sorting is done by default alphabetical order

		TreeSet t = new TreeSet<>();

		t.add("A");
		t.add("D");
		t.add("B");
		t.add("C");
		t.add("A");
		

		System.out.println(t);

		System.out.println("*********************************"); // Sorted Set Interface

		System.out.println(t.first()); // returns first element

		System.out.println(t.last()); // returns last element

		System.out.println("*********************************");

		System.out.println(t.headSet("C")); // returns values before "C" not including (After sorting set)

		System.out.println(t.tailSet("C")); // returns values greater than "C" including "C" (After sorting set)

		System.out.println(t.subSet("B", "D")); // return values including "B" but excluding "D" (After sorting set)
		
		System.out.println(t.comparator()); // NULL due to natural sorting 
		
		System.out.println("*********************************"); // Navigable Set Interface
		
		System.out.println(t.ceiling("C")); // returns greater than or equal to or Null
		
		System.out.println(t.floor("E")); // returns less than or equal to or Null 
		
		System.out.println(t.higher("A")); // same as ceiling but not equal to 
		
		System.out.println(t.lower("D")); // same as floor but not equal to
		
		// t.pollfirst() // returns and remove first element
		
		// t.polllast() // returns and remove last element

	}

}
