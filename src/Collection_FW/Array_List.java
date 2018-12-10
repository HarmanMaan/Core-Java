package Collection_FW;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add("A"); // index 0 // to add vales
		ar.add("B"); // 1
		ar.add("C"); // 2

		System.out.println(ar.size());

		System.out.println(ar.get(0));
		// ar.set(0, "D"); // will set/change the element/value

		ar.add(0, "D"); // will add the element at the location index and shift the elements

		System.out.println(ar.get(0));

		System.out.println(ar.get(2));

		System.out.println("****************************");

		ArrayList ar1 = new ArrayList();

		ar1.add(1); // 3
		ar1.add(2); // 4
		ar1.addAll(ar); // to add another ArrayList values

		System.out.println(ar1.size()); // size = 5

		System.out.println(ar1.get(4));

		ar1.remove(1); // remove value from list //

		System.out.println("****************************");

		System.out.println(ar1.size()); // size = 4

		System.out.println("****************************");

		// to print all values of the list
		// we use for loop

		for (int i = 0; i < ar1.size(); i++) {

			System.out.println(ar1.get(i));

		}

		System.out.println("****************************");

		// ar.clear(); // this will remove values of ar list only

		// ar1.removeAll(ar1); // will remove all values from list

		System.out.println(ar1.size()); // size = 0

		System.out.println("****************************");

		ar1.retainAll(ar); // will remove all values of ar1 and return values of ar only

		for (int i = 0; i < ar1.size(); i++) {

			System.out.println(ar1.get(i));

		}

	}

}
