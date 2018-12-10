package Collection_FW;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_AL {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		for (int i = 0; i <= 10; i++) {

			al.add(i);

		}

		System.out.println(al); // Normally print

		System.out.println("*******************************************");

		// Using Iterator cursor to traverse
		// This common for all list Classes
		// One more function than Enumeration (remove)

		Iterator it = al.iterator();
		while (it.hasNext()) {

			Integer t = (Integer) it.next();
		}
		System.out.println(al); // Using Arraylist name (Outside while loop)

		System.out.println("********************************************");

		Iterator it2 = al.iterator();
		while (it2.hasNext()) {

			Integer t = (Integer) it2.next();
			System.out.println(t); // Using Iterator integer (Inside while loop)
		}

		System.out.println("********************************************");

		Iterator it1 = al.iterator();
		while (it1.hasNext()) {

			Integer t1 = (Integer) it1.next();

			if (t1 > 3 & t1 < 8)
				it1.remove(); // To remove from the list (Inside while loop)
		}

		System.out.println(al);

	}
}
