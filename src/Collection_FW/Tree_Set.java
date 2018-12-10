package Collection_FW;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {

		// Duplicates are not not allowed
		// Insertion order is not preserved
		// *******Null value is not allowed
		// Sorting is done by default alphabetical order
		// ******* Only homogeneous datatypes are allowed (int , String , char etc)
		// not combination
		// ***** default natural sorting applies to comparable & homogeneous eg String ,
		// int
		// Stringbuffer is not comparable
		// ******* follows Compareto() method for sorting (tree branches left to right)

		TreeSet t = new TreeSet<>();

		// *******Comparable used for default natural sorting
		t.add("A");
		t.add("D");
		t.add("B");
		t.add("C");
		t.add("A");
		// t.add(10); // combination of elements not allowed in same set

		System.out.println(t);

		System.out.println("*******************************");

		TreeSet t1 = new TreeSet<>();

		t1.add(30);
		t1.add(40);
		t1.add(10);
		t1.add(20);
		t1.add(10);
		// t1.add("A"); // combination of elements not allowed in same set

		System.out.println(t1);

	}

}
